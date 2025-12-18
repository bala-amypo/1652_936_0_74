package com.example.demo.service.Impl;
@Service
public class ValidationServiceImpl implements ValidationService {
    @Autowired ValidationRepository validation;
     ValidationEntity postdata(@RequestBody ValidationEntity en);
}