package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;


public interface StudentService {
     StudentEntity postdata(@RequestBody StudentEntity stu);
}
