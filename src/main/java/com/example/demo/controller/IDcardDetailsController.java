package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.entity.StudentDetailsEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class IDcardDetailsController {
   @Autowired IDcardDetailsService se;
   @PostMapping("/m")
   public StudentDetailsEntity send(@RequestBody IDcardDetailsEntity s){
     return se.s(s);
   }    
   
}