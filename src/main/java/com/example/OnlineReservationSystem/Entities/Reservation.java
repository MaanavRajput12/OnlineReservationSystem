package com.example.OnlineReservationSystem.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Trains train;

    @Column(nullable = false)
    private int seatNumber;
    @Column(nullable = false)
    private LocalDate reservationDate;
    @Column(nullable = false)
    private String status;  // Either CONFIRMED or CANCELLED

    public Reservation() {}

    public Reservation(User user, Trains train, int seatNumber, LocalDate reservationDate, String status) {
        this.user = user;
        this.train = train;
        this.seatNumber = seatNumber;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    public Long getReservationId() {return reservationId;}
    
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    public Trains getTrain() {return train;}
    public void setTrain(Trains train) {this.train = train;}

    public int getSeatNumber() {return seatNumber;}
    public void setSeatNumber(int seatNumber) {this.seatNumber = seatNumber;}

    public LocalDate getReservationDate() {return reservationDate;}
    public void setReservationDate(LocalDate reservationDate) {this.reservationDate = reservationDate;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
}
