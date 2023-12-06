package com.example.demo.Repository;

import com.example.demo.Models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
    // Additional query methods if needed
}
