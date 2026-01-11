package com.example.OnlineReservationSystem.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineReservationSystem.Entities.Reservation;
import com.example.OnlineReservationSystem.Entities.User;
import com.example.OnlineReservationSystem.Services.ReservationServices;
import com.example.OnlineReservationSystem.Services.UserServices;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationServices reservationServices;
    private final UserServices userServices;

    public ReservationController(
            ReservationServices reservationServices,
            UserServices userServices) {
        this.reservationServices = reservationServices;
        this.userServices = userServices;
    }

    // BOOK RESERVATION
    @PostMapping("/book")
    public Reservation bookReservation(
            @RequestParam String username,
            @RequestParam Long trainId) {

        return reservationServices.bookReservation(username, trainId);
    }

    // GET RESERVATIONS BY USER
    @GetMapping("/user/{username}")
    public List<Reservation> getReservationsByUser(@PathVariable String username) {
        User user = userServices.getUserByUsername(username);
        return reservationServices.getReservationsByUser(user);
    }
}
