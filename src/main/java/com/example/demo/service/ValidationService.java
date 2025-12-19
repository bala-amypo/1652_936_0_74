package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface ValidationService{
    ValidationEntity (@RequestBody ValidationEntity en);
    ValidationEntity getdata(Long id);
}