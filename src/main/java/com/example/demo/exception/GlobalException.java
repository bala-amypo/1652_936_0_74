package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestContollerAdvice;

@RestControllerAdvice
public class GlobalException {
  @ExceptionHandler(ValidationException.class)
  public ResponseBody<String>handleValidationException(ValidationException ex){
    return new ResponseBody<String>();
  }
}