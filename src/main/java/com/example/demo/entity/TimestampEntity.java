package com.example.demo.entity;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimestampEntity {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private String password;
     private LocalDateTime createAt;
     private LocalDateTime updateAt;


     @PrePersist
     public void Oncreate(){
         
         this.createAt=now;
         this.updateAt=now;

     }
     @PreUpdate
     public void Onupdate(){
      this.updateAt=now;

     }
}