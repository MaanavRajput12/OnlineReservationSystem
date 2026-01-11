package com.example.OnlineReservationSystem.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineReservationSystem.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional <User> findByUsername(String username);
    
}
