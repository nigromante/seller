package com.nigromante.seller.infrastructure.controllers;

import com.nigromante.seller.application.repositories.OrderRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.nigromante.seller.application.services.*;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping( value = "order" )
public class OrderController {


  @Autowired 
  private OrderService service;

  
  @PostMapping( value="getall")
  public String list() {
      
        List<String> result = service.list();
      
    return "saludos desde (GET /order): " + this.getClass().getName();
  } 


  @PostMapping( value="find")
  public String findById( @RequestParam String orderId ) {
      
      
    return "saludos desde (GET /find): " + this.getClass().getName() + "  orderId: " + orderId ;
  } 


  @PostMapping( value = "create" )
  public String create() {
      
        int tt = service.create("mitomano", "gunns & rooses" );
      
    return "saludos desde (POST /order): " + this.getClass().getName();
  } 
  
}
