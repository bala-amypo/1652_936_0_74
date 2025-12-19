package com.example.demo.service;


@Service
public class TimestampServiceImpl implements TimestampService {
    @Autowired TimestampRepository t;
     
     @Override
     public TimestampEntity senddata( TimestampEntity e){
         return t.save(e);
     }
}