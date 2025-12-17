package com.demo.example.service;

import com.example.demo.entity.StudentEntity;


public interface StudentService {
     StudentEntity postdata(@RequestBody StudentEntity student)
}