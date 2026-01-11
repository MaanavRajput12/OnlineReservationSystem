package com.example.OnlineReservationSystem.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Trains")
public class Trains{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainId;

    @Column(nullable = false)
    private String trainName;
    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private String destination;
    @Column(nullable = false)
    private int totalSeats;

    public Trains() {}

    public Trains(String trainName, String source, String destination, int totalSeats) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
    }

    public Long getTrainId() {return trainId;}
    
    public String getTrainName() {return trainName;}
    public void setTrainName(String trainName) {this.trainName = trainName;}

    public String getSource() {return source;}
    public void setSource(String source) {this.source = source;}

    public String getDestination() {return destination;}
    public void setDestination(String destination) {this.destination = destination;}

    public int getTotalSeats() {return totalSeats;}
    public void setTotalSeats(int totalSeats) {this.totalSeats = totalSeats;}
}