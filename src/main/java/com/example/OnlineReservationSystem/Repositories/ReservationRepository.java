package com.example.OnlineReservationSystem.Repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineReservationSystem.Entities.Reservation;
import com.example.OnlineReservationSystem.Entities.Trains;
import com.example.OnlineReservationSystem.Entities.User;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional<Reservation> findByReservationId(Long reservationId);
    List<Reservation> findByUser(User user);
    List<Reservation> findByTrain(Trains train);
    
}
