package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IDcardDetailsEntity {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id;
     private String cardnumber;
     @OneToOne
     @JoinColumn(name ="student_id")
     private StudentDetailsEntity student;
}