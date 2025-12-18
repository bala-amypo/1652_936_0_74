package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationService;
@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepository validation;
     
     @Override
     public ValidationEntity postdata(@RequestBody ValidationEntity en){
         return validation.save(en);
     }
}