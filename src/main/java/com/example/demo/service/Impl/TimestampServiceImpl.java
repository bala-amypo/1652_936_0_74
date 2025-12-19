package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TimestampRepository;

@Service
public class TimestampServiceImpl implements TimestampService {
    @Autowired TimestampRepository t;
     
     @Override
     public TimestampEntity sended( TimestampEntity e){
         return t.save(e);
     }
}