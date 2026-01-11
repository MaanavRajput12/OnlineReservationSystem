package com.example.OnlineReservationSystem.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.OnlineReservationSystem.Entities.Trains;
import com.example.OnlineReservationSystem.ExceptionHandlers.ResourceNotFoundException;
import com.example.OnlineReservationSystem.Repositories.TrainsRepository;

@Service
public class AdminServices {
    private final TrainsRepository trainsRepository;

    public AdminServices(TrainsRepository trainsRepository) {
        this.trainsRepository = trainsRepository;
    }

    public Trains addTrain(Trains train) {
        return trainsRepository.save(train);
    }

    public Trains updateTrain(Long trainId, Trains updatedTrain) {
        Trains existingTrain = trainsRepository.findById(trainId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Train not found with id: " + trainId));

        existingTrain.setTrainName(updatedTrain.getTrainName());
        existingTrain.setSource(updatedTrain.getSource());
        existingTrain.setDestination(updatedTrain.getDestination());
        existingTrain.setTotalSeats(updatedTrain.getTotalSeats());

        return trainsRepository.save(existingTrain);
    }

    public void deleteTrain(Long trainId) {
        Trains train = trainsRepository.findById(trainId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Train not found with id: " + trainId));

        trainsRepository.delete(train);
    }

    public List<Trains> getAllTrains() {
        return trainsRepository.findAll();
    }
}
