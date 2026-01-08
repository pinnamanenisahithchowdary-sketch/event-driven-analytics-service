package com.analytics.api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EventController {

    @PostMapping("/events")
    public Map<String, String> ingestEvent(@RequestBody Map<String, Object> event) {
        return Map.of("status", "event received");
    }

    @GetMapping("/analytics/total")
    public Map<String, Integer> totalEvents() {
        return Map.of("total", 1);
    }
}
