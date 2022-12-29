package com.app.springapiapp.global.error.exception;

import com.app.springapiapp.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private ErrorCode errorCode;
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
//        System.out.println("errorCode = " + errorCode);
//        System.out.println("errorCode.getMessage() = " + errorCode.getMessage());
//        System.out.println("errorCode.getErrorCode() = " + errorCode.getErrorCode());
        this.errorCode = errorCode;
    }
}