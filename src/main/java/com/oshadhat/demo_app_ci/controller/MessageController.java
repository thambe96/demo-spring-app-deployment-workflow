package com.oshadhat.demo_app_ci.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class MessageController {

    @GetMapping("/morning")
    public ResponseEntity<String> getMorningGreeting() {
        return ResponseEntity.ok("Good Morning!");
    }


    @GetMapping("/evening")
    public ResponseEntity<String> getEveningGreeting() {
        return new ResponseEntity<String>("Good Evening!", HttpStatus.OK);
    }


}
