package com.example.OnlineReservationSystem.Repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineReservationSystem.Entities.Trains;

public interface TrainsRepository extends JpaRepository<Trains, Long> {
    Optional<Trains> findByTrainNumber(String trainNumber);
    List<Trains> findBySourceAndDestination(String source, String destination);

    Optional<Trains> findByTrainName(String trainName);
}
