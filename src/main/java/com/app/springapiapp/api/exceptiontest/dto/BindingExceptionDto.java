package com.app.springapiapp.api.exceptiontest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class BindingExceptionDto {

    @NotEmpty(message = "해당 값은 필수 입력값입니다.")
    private String value1;

    @Max(value = 10, message = "최대 입력 값은 10 입니다.")
    private Integer value2;
}
