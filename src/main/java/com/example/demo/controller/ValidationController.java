package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class ValidationController {
   @Autowired ValidationService service;

   @PostMapping("/po")
   public ValidationEntity send(@Valid @RequestBody ValidationEntity valid){
    return service.postdata(valid);
   }
    @GetMapping("/fi/{id}")
    public StudentEntity finddata(@PathVariable int id){
    return service.getdata(id);
    }
}