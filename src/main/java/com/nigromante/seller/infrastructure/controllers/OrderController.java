package com.nigromante.seller.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.nigromante.seller.application.services.*;

@RestController
@RequestMapping( value = "order" )
public class OrderController {
    

  @PostMapping( value="getall")
  public String list() {
      
      OrderService service = new OrderServiceImpl(); 
        List<String> result = service.list();
      
    return "saludos desde (GET /order): " + this.getClass().getName();
  } 


  @PostMapping( value="find")
  public String findById( @RequestParam String orderId ) {
      
      OrderService service = new OrderServiceImpl(); 
        List<String> result = service.list();
      
    return "saludos desde (GET /find): " + this.getClass().getName() + "  orderId: " + orderId ;
  } 


  @PostMapping( value = "create" )
  public String create() {
      
        OrderService service = new OrderServiceImpl(); 
        int tt = service.create("mit", "gnn");
      
    return "saludos desde (POST /order): " + this.getClass().getName();
  } 
  
}
