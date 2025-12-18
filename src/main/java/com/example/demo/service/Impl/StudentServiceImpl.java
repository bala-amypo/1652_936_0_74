package com.example.demo.service.Impl;
 
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    @Override
      public  StudentEntity postdata(StudentEntity stu){
         return student.save(stu);
      }
      @Override
      public List<StudentEntity>getAlldata(){
           return student.findAll();
      }
      @Override
      public String Deletedata( int id){
        student.deleteById(id);
         return "Deleted sucessfully";
      }
      @Override
      public StudentEntity getdata(int id){
         return student.findById(id).orElse(null);
      }
      public StudentEntity update(int id,StudentEntity enetity){
         if(student)
      }
}