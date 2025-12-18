package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Valid;

@Restcontroller
public class ValidationController {
   @AutoWired ValidationService service;

   @PostMapping("/po")
   public ValidationEntity send(@Valid @RequestBody ValidationEntity valid){
    return service.postdata(valid);
   }
}