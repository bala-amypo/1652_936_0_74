package com.example.demo.service.Impl;
@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepository validation;
     
     @Override
     public ValidationEntity postdata(@RequestBody ValidationEntity en){
         return validation.save(en);
     }
}