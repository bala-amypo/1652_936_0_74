package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TimestampController {
   @Autowired TimestampService service;

   @PostMapping("/po")
   public Entity send(@Valid @RequestBody ValidationEntity valid){
    return service.senddata(valid);
   }

}