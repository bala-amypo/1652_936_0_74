package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.IDcardDetailsEntity;

@Repository
public interface  IDcardDetailsRepository extends JpaRepository<IDcardDetailsEntity,Integer> {
       
}