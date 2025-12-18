package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


public interface StudentService {
     StudentEntity postdata(@RequestBody StudentEntity stu);
     List<StudentEntity>getAlldata();
     String Deletedata(int id)
}

