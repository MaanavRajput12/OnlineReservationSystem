package com.example.OnlineReservationSystem.DTOs;

public class LoginResponseDTO {
    private final Long userId;
    private final String username;
    private final String role;
    private final String message;

    public LoginResponseDTO(Long userId, String username, String role, String message) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.message = message;
    }

    public Long getUserId(){ return userId;}

    public String getUsername(){ return username;}

    public String getRole(){ return role;}

    public String getMessage(){ return message;}

}
