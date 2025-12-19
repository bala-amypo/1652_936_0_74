package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface ValidationService{
    ValidationEntity senddata(@RequestBody ValidationEntity en);
    ValidationEntity get(Long id);
}