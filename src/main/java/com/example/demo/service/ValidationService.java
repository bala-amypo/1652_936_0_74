package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface ValidationService{
    ValidationEntity postdata(@RequestBody ValidationEntity en);
}