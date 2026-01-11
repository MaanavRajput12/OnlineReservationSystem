package com.example.OnlineReservationSystem.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.OnlineReservationSystem.Entities.Reservation;
import com.example.OnlineReservationSystem.Entities.Trains;
import com.example.OnlineReservationSystem.Entities.User;
import com.example.OnlineReservationSystem.Repositories.ReservationRepository;

@Service
public class ReservationServices {
    private final ReservationRepository reservationRepository;
    private final UserServices userServices;
    private final TrainServices trainServices;

    public ReservationServices(ReservationRepository reservationRepository, UserServices userServices, TrainServices trainServices) {
        this.reservationRepository = reservationRepository;
        this.userServices = userServices;
        this.trainServices = trainServices;
    }

    public Reservation bookReservation(String username, Long trainId) {
        User user = userServices.getUserByUsername(username);
        Trains train = trainServices.getTrainById(trainId);

        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setTrain(train);
        reservation.setStatus("BOOKED");

        return reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsByUser(User user) {
    return reservationRepository.findByUser(user);
}

}
