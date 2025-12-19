package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class TimestampController {
   @Autowired TimestampService service;

   @PostMapping("/o")
   public TimestampEntity send( @RequestBody TimestampEntity valid){
    return service.senddata(valid);
   }

}