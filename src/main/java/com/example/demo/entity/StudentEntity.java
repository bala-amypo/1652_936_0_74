package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class StudentEntity {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       private Integer id;
       private String Username;
       private String email;
       private String password;
       private Date createAt;
       
       public void setId(Integer id){
        this.id=id;
       }
       public Integer getId(){
        return id;
       }
       public String getUsername(){
        return username;
       }
       public void setUsername(String username){
        this.username=username;
       }
       public String getemail(){
        return email;
       }
       public void setemail(String email){
        this.email=email;
       }
       public String getpassword(){
        return password;
       }
       public void setpassword(String password){
        this.password=password;
       }
       public Date getcreateAt(){
        return createAt;
       }
       public void setcreateAt(Date createAt){
        this.createAt=createAt;
       }
       public  StudentEntity(Integer id,String username,String email,String password,Date createAt ){
        this.id=id;
        this.Username=Username;
        this.email=email;
        this.password=password;
        this.createAt=createAt;
       }

       public StudentEntity(){

       }


}