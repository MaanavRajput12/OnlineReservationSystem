package com.example.OnlineReservationSystem.DTOs;

public class TrainResponseDTO{
    private Long trainId;
    private String trainName;
    private String source;
    private String destination;
    private int totalSeats;

    public Long getTrainId() {return trainId;}
    
    public String getTrainName() {return trainName;}

    public String getSource() {return source;}

    public String getDestination() {return destination;}

    public int getTotalSeats() {return totalSeats;}
}