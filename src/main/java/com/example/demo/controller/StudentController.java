package com.example.demo.controller;

import org.springframework.web.bind.annotation.Restcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;

@Restcontroller
public class StudentController {
   @Autowired StudentService ser;

}