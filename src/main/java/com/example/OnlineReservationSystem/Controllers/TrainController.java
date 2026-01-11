package com.example.OnlineReservationSystem.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineReservationSystem.Services.TrainServices;

@RestController
@RequestMapping("/trains")
public class TrainController {
    private final TrainServices trainServices;
    public TrainController(TrainServices trainServices) {
        this.trainServices = trainServices;
    }

    @GetMapping("/{trainName}")
    public ResponseEntity<?> getTrainByName(@RequestParam String trainName) {
        return ResponseEntity.ok(trainServices.getTrainByName(trainName));
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchTrains(@RequestParam String source, @RequestParam String destination) {
        return ResponseEntity.ok(trainServices.searchTrains(source, destination));
    }

}
