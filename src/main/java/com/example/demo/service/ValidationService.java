package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;


public interface ValidationService{
    ValidationEntity senddata(ValidationEntity en);
    ValidationEntity get(Long id);
}