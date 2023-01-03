package com.app.springapiapp.api.fegintest.controller;

import com.app.springapiapp.api.fegintest.client.HelliClient;
import com.app.springapiapp.api.health.dto.HealthCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthFeignTestController {

    private final HelliClient helliClient;

    @GetMapping("/health/feign-test")
    public ResponseEntity<HealthCheckResponseDto> healthCheckTest() {
        HealthCheckResponseDto healthCheckResponseDto = helliClient.healthCheck();
        return ResponseEntity.ok(healthCheckResponseDto);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("hi");
    }
}
