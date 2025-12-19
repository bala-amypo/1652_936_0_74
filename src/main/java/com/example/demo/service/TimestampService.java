package com.example.demo.service;

import com.example.demo.entity.TimestampEntity;


public interface TimestampService{
    TimestampEntity senddata(TimestampEntity en);
    TimestampEntity get(Long id);
}