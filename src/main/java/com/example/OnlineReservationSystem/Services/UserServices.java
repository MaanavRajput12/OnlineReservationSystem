package com.example.OnlineReservationSystem.Services;
import org.springframework.stereotype.Service;

import com.example.OnlineReservationSystem.Entities.User;
import com.example.OnlineReservationSystem.ExceptionHandlers.ResourceNotFoundException;
import com.example.OnlineReservationSystem.Repositories.UserRepository;

@Service
public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> 
                    new ResourceNotFoundException(
                        "User not found with username: " + username
                    )
                );
    }

    public User getUserReservations(String username) {
        User user = getUserByUsername(username);
        if (user.getReservations() != null) {
            user.getReservations(); 
        }
        return user;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
