package com.example.OnlineReservationSystem.Services;

import org.springframework.stereotype.Service;
import com.example.OnlineReservationSystem.ExceptionHandlers.InvalidCredentialsException;
import com.example.OnlineReservationSystem.Entities.User;
import com.example.OnlineReservationSystem.DTOs.LoginRequestDTO;

@Service
public class AuthServices {
    private final UserServices userServices;
    public AuthServices(UserServices userServices) {this.userServices = userServices;}

    public User login(LoginRequestDTO dto){
    User user= userServices.getUserByUsername(dto.getUsername());
    if(!user.getPassword().equals(dto.getPassword())){
        throw new InvalidCredentialsException("Invalid password for username: " + dto.getUsername());
    }
    return user;
}
}

