package com.example.demo.controller;

@Restcontroller
public class ValidationController {
   @AutoWired ValidationService service;

   @PostMapping("/po")
   public ValidationEntity send()
}