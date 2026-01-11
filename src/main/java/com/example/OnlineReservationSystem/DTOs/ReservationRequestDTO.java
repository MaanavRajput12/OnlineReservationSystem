package com.example.OnlineReservationSystem.DTOs;
import jakarta.validation.constraints.NotNull;

public class ReservationRequestDTO {
    @NotNull
    private Long userId;
    @NotNull
    private Long trainId;
    @NotNull
    private int seatNumber;

    public Long getUserId() {return userId;}
    public void setUserId(Long userId) {this.userId = userId;}

    public Long getTrainId() {return trainId;}
    public void setTrainId(Long trainId) {this.trainId = trainId;}

    public int getSeatNumber() {return seatNumber;}
    public void setSeatNumber(int seatNumber) {this.seatNumber = seatNumber;}
}
