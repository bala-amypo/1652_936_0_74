package com.example.demo.entity;

@Entity
public class StudentEntity {
       private Integer id;
       private String username;
       private String email;
       private String password;
       private Date createAt;
       
       public void setId(int id){
        this.id=id;
       }
       public int getId(){
        return id;
       }
       public String getusername(){
        return username;
       }
       public void setusername(String username){
        this.username=username;
       }
       public String


}