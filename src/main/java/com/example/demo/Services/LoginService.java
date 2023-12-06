package com.example.demo.Services;

// LoginService.java
import com.example.demo.Models.Login;
import com.example.demo.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Login> findAll(){
        return loginRepository.findAll();
    }
    public Boolean processAllLogins(Login inputValues) {
        List<Login> allLogins = loginRepository.findAll();

        for (Login loginValues : allLogins) {
            if(inputValues.getEmail().equals(loginValues.getEmail()) &&
                inputValues.getPassword().equals(loginValues.getPassword())){
                return true;
            }
        }
        return false;
    }

    // Add login-related business logic if needed
}

