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


}