package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.entity.StudentDetailsEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class StudentDetailsController {
   @Autowired StudentDetailsService ser;
   @PostMapping("/p")
   public StudentDetailsEntity send(@RequestBody StudentDetailsEntity s){
     return ser.sd(s);
   }    
   
}