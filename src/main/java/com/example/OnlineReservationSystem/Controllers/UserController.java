package com.example.OnlineReservationSystem.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineReservationSystem.Services.UserServices;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/{username}")
    public ResponseEntity<?>getUserByUsername(@PathVariable String username) {
        return ResponseEntity.ok(userServices.getUserByUsername(username));
    }
    
    @GetMapping("/{username}/reservations")
    public ResponseEntity<?> getUserReservations(@PathVariable String username) {
        return ResponseEntity.ok(userServices.getUserReservations(username));
    }
}
