package com.app.springapiapp.api.health.controller;

import com.app.springapiapp.api.health.dto.HealthCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthCheckController {
    private final Environment environment;

    @GetMapping("/health")
    public ResponseEntity<HealthCheckResponseDto> getHealth(){
        HealthCheckResponseDto healthCheckResponseDto = HealthCheckResponseDto.builder()
                .health("ok")
                .activeProfiles(Arrays.asList(environment.getActiveProfiles())).build();

        return ResponseEntity.ok(healthCheckResponseDto);
    }
}
