package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.exception.ValidationException;
@Service
public class TimestampServiceImpl implements TimestampService {
    @Autowired TimestampRepository t;
     
     @Override
     public TimestampEntity senddata( TimestampEntity e){
         return t.save(e);
     }
}