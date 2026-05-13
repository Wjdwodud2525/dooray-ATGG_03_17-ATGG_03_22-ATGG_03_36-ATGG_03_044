package com.nhnacademy.dooray.gateway.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class Team5FightingController {

    @GetMapping
    public Map<String, String> status() {
        return Map.of(
                "application", "5조화이팅-gateway",
                "status", "UP"
        );
    }
}
