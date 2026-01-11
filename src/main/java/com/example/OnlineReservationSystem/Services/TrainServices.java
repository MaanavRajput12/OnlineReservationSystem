package com.example.OnlineReservationSystem.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.OnlineReservationSystem.Entities.Trains;
import com.example.OnlineReservationSystem.ExceptionHandlers.ResourceNotFoundException;
import com.example.OnlineReservationSystem.Repositories.TrainsRepository;

@Service
public class TrainServices {
    private final TrainsRepository trainsRepository;

    public TrainServices(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }

    public List<Trains> getAllTrains() {
        return trainsRepository.findAll();
    }
    public Trains getTrainById(Long id) {
        return trainsRepository.findById(id)
                .orElseThrow(() -> 
                    new ResourceNotFoundException(
                        "Train not found with id: " + id
                    )
                );
    }

    public Trains getTrainByName(String trainName) {
        return trainsRepository.findByTrainName(trainName)
                .orElseThrow(() -> 
                    new ResourceNotFoundException(
                        "Train not found with name: " + trainName
                    )
                );
    }

    public List<Trains> searchTrains(String source, String destination) {
        return trainsRepository.findBySourceAndDestination(source, destination);
    }
}
