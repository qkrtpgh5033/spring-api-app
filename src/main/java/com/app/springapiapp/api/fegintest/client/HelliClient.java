package com.app.springapiapp.api.fegintest.client;


import com.app.springapiapp.api.health.dto.HealthCheckResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 호출할 url 주소, 빈 이름
@FeignClient(url = "http://localhost:8080", name = "helloClient")
public interface HelliClient {
// test test
    @GetMapping(value = "/api/health", consumes = "application/json")
    HealthCheckResponseDto healthCheck();

//    // 에러 테스트 할라고 일부러 없는 url을 통해 테스트 진행
//    @GetMapping(value = "/api/healthError", consumes = "application/json")
//    HealthCheckResponseDto healthCheckErrorTest();
}
