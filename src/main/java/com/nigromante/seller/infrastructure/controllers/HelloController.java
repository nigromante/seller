package com.nigromante.seller.infrastructure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
  @GetMapping("/")
  public String index() {
      
    return "saludos desde (index): " + this.getClass().getName();
  } 
  
}
