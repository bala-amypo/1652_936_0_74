package com.example.demo.service;


@Service
public class TimestampServiceImpl implements ValidationService {
    @Autowired ValidationRepository validation;
     
     @Override
     public TimestampEntity senddata( ValidationEntity en){
         return validation.save(en);
     }