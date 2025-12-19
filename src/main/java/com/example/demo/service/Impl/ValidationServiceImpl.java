package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.exception.ValidationException;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepository validation;
     
     @Override
     public ValidationEntity senddata( ValidationEntity en){
         return validation.save(en);
     }
     
     @Override
     public ValidationEntity get(Long id){
        return validation.findById(id).orElseThrow(()->new ValidationException("Invalid id"+id));
     }
}