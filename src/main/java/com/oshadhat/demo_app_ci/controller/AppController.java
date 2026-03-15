package com.oshadhat.demo_app_ci.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/app")
public class AppController {

    @GetMapping("message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hey there! It's Oshadhat I am testing CI/CD workflow with my demo-spring-boot app!!!");
    }


//    @GetMapping("terminate")
//    public ResponseEntity<String> kill() {
//        new Thread(() -> {
//            try {
//                Thread.sleep(1000);
//                System.out.println("Killing the Application.....!!");
//                System.exit(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
//        return ResponseEntity.ok("Killing the Application.....!!");
//    }


}
