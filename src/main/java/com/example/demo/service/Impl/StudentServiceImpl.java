package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
      public  StudentEntity postdata(@RequestBody StudentEntity stu){
        
      }

}