package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentDetailsEntity;
import com.example.demo.service.StudentDetailsService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentDetailsRepository;


@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
    @Autowired StudentDetailsRepository val;
     
     @Override
     public StudentDetailsEntity sd( StudentDeatilsEntity st){
         return val.save(st);
     }
     
     
}