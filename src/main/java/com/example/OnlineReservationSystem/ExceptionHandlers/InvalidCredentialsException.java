package com.example.OnlineReservationSystem.ExceptionHandlers;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message) {
        super(message);
    }
    
}
