package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
      public  StudentEntity postdata(@RequestBody StudentEntity stu){
         //save()
         //findAll()
         //findById()
         //deleteById()
         //existsByID()
         return student.saveof()
      }

}