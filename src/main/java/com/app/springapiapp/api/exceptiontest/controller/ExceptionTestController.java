package com.app.springapiapp.api.exceptiontest.controller;


import com.app.springapiapp.api.exceptiontest.dto.BindingExceptionDto;
import com.app.springapiapp.api.exceptiontest.dto.TestEnum;
import com.app.springapiapp.global.error.ErrorCode;
import com.app.springapiapp.global.error.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ExceptionTestController {

    @GetMapping("/bind-exception-test")
    public String bindExceptionTest(@Valid BindingExceptionDto bindingExceptionDto) {

        return "ok";
    }

    @GetMapping("/type-exception-test")
    public String typeExceptionTest(@RequestParam("testEnum") TestEnum testEnum) {
        return "ok";
    }

    @GetMapping("/business-exception-test")
    public String businessExceptionTest(String isError) {
        if (isError.equals("true")) {
            throw new BusinessException(ErrorCode.TEST);
        }
        return "ok";
    }

    @GetMapping("/exception-test")
    public String exceptionTest(String isError){
        if (isError.equals("true")) {
            throw new IllegalArgumentException("예외 테스트");
        }
        return "ok";
    }
}
