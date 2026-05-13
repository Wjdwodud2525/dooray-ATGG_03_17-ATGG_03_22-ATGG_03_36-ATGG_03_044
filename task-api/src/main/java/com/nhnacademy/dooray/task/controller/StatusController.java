package com.nhnacademy.dooray.task.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @GetMapping
    public Map<String, String> status() {
        return Map.of(
                "application", "task-api",
                "status", "UP"
        );
    }
}
