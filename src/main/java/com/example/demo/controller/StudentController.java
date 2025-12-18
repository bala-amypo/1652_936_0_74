package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class StudentController {
   @Autowired StudentService ser;
   @PostMapping("/post")
   public StudentEntity senddata(@RequestBody StudentEntity s){
     return ser.postdata(s);
        
   }
   @GetMapping("/get")
   public List<StudentEntity> getval(){
     return ser.getAlldata();
   }
   @DeleteMapping("/delete/{id}")
    public String deleteval(@PathVariable int id){
      return ser.Deletedata(id);
    }
    @GetMapping("/find/{id}")
    public StudentEntity finddata(@PathVariable int id){
    return ser.getdata(id);
   }
   @PutMapping("/put/{id}")
    public StudentEntity putval(@PathVariable int id,@RequestBody StudentEntity entity){
    return ser.update(id,entity);
    }
}