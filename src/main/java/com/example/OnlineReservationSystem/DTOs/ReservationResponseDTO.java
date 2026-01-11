package com.example.OnlineReservationSystem.DTOs;

import java.time.LocalDateTime;

public class ReservationResponseDTO {
    private final Long reservationId;
    private final String trainNumber;
    private final int seatNumber;
    private final String status;
    private final LocalDateTime reservationDate;

    public ReservationResponseDTO(Long reservationId, String trainNumber, int seatNumber, String status, LocalDateTime reservationDate) {
        this.reservationId = reservationId;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
        this.status = status;
        this.reservationDate = reservationDate;
    }

    public Long getReservationId() {return reservationId;}
    
    public String getTrainNumber() {return trainNumber;}

    public int getSeatNumber() {return seatNumber;}

    public String getStatus() {return status;}
    public LocalDateTime getReservationDate() {return reservationDate;}
}
