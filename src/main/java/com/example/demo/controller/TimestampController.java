package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TimestampController {
   @Autowired TimestampService service;

   @PostMapping("/po")
   public TimestampEntity send(@Valid @RequestBody TimestampEntity valid){
    return service.senddata(valid);
   }

}