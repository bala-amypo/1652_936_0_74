package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.IDcardDetailsEntity;
import com.example.demo.service.IDcardDetailsService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IDcardDetailsRepository;


@Service
public class IDcardDetailsServiceImpl implements IDcardDetailsService {
    @Autowired IDcardDetailsRepository vl;
     
     @Override
     public StudentDetailsEntity s( StudentDeatilsEntity n){
         return vl.save(n);
     }
     
     
}