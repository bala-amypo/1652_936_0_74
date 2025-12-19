package com.example.demo.entity;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimestampEntity {
     private Long id;
     private String name;
     private String email;
     private String password;
     private LocalDateTime createAt;
     private LocalDateTime updateAt;
}