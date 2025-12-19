package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentDetailsEntity;
import com.example.demo.service.StudentDetailsService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentDetailsRepository;


@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
    @Autowired StudentRepository validation;
     
     @Override
     public ValidationEntity senddata( ValidationEntity en){
         return validation.save(en);
     }
     
     @Override
     public ValidationEntity get(Long id){
        return validation.findById(id).orElseThrow(()->new ValidationException("Invalid id"+id));
     }
}