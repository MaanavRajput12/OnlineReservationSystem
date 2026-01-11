package com.example.OnlineReservationSystem.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineReservationSystem.Entities.Trains;
import com.example.OnlineReservationSystem.Services.AdminServices;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminServices adminServices;

    public AdminController(AdminServices adminServices) {
        this.adminServices = adminServices;
    }

    @PostMapping("/trains")
    public ResponseEntity<Trains> addTrain(@RequestBody Trains trains) {
        Trains savedTrain = adminServices.addTrain(trains);
        return new ResponseEntity<>(savedTrain, HttpStatus.CREATED);
    }

    @PutMapping("/trains/{trainId}")
    public ResponseEntity<Trains> updateTrain(
            @PathVariable Long trainId,
            @RequestBody Trains trains) {

        Trains updatedTrain = adminServices.updateTrain(trainId, trains);
        return ResponseEntity.ok(updatedTrain);
    }

    // Delete train
    @DeleteMapping("/trains/{trainId}")
    public ResponseEntity<String> deleteTrain(@PathVariable Long trainId) {
        adminServices.deleteTrain(trainId);
        return ResponseEntity.ok("Train deleted successfully");
    }

    // Get all trains
    @GetMapping("/trains")
    public ResponseEntity<List<Trains>> getAllTrains() {
        return ResponseEntity.ok(adminServices.getAllTrains());
    }
}
