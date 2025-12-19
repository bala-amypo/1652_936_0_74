package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestContollerAdvice;
import org.springframework.web.bind.annotation.ResponseEntity;
import org.springframework.web.bind.annotation.RestContollerAdv;
@RestControllerAdvice
public class GlobalException {
  @ExceptionHandler(ValidationException.class)
  public ResponseEntity<String>handleValidationException(ValidationException ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
  }
}