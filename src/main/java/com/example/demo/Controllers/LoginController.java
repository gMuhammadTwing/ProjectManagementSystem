package com.example.demo.Controllers;

// LoginController.java
import com.example.demo.Models.Login;
import com.example.demo.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/data")
    public List<Login> getData(){
        return loginService.findAll();
    }
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody Login loginInput) {
        if(loginService.processAllLogins(loginInput)){
            return ResponseEntity.ok("Authentication successful!");
        }
        else{
            return ResponseEntity.ok("Authentication failed!");
        }


    }
}

