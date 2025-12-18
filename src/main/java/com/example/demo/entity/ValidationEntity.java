package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;




@Entity
public class ValidationEntity {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   @NotNull
   @Size(min = 2,max = 10,message = "must be 2 to 10 character")
   private String Username;
   @Email(message="Email is valid")
   private String email;
   @Size(min = 2,max = 8)
   @NotNull(message="Password is mandatory")
   private String password;
   @Max(30)
   @Positive(message="Age must be positive")
   private Integer age;

   public void setId(Long id){
        this.id=id;
       }
       public Long getId(){
        return id;
       }
       public String getUsername(){
        return Username;
       }
       public void setUsername(String Username){
        this.Username=Username;
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
       public int getage(){
        return age;
       }
       public void setage(int age){
        this.age=age;
       }

       public ValidationEntity(Long id,
       @NotNull @Size(min = 2,max = 10,message = "must be 2 to 10 character") String Username,
       @Email(message="Email is valid") String email,
       @Size(min = 2,max = 8) @NotNull(message="Password is mandatory") String password,
       @Max(30) @Positive(message="Age must be positive") int age){
        this.id=id;
        this.Username=Username;
        this.email=email;
        this.password=password;
        this.age=age;
        }
        public ValidationEntity(){

        }


   
}
