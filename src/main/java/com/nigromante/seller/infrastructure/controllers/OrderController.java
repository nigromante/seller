package com.nigromante.seller.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import java.util.List;

import com.nigromante.seller.application.services.*;


@RestController
@RequestMapping( value = "order" )
public class OrderController {


  @Autowired 
  private OrderService service;

  
  @PostMapping( value="getall", produces = MediaType.APPLICATION_JSON_VALUE )
  public String list() {
      
        List<String> result = service.list();
      
    return "saludos desde (GET /order): " + this.getClass().getName();
  } 


  @PostMapping( value="find", produces = MediaType.APPLICATION_JSON_VALUE )
  public String findById( @RequestParam String orderId ) {
      
      
    return "saludos desde (GET /find): " + this.getClass().getName() + "  orderId: " + orderId ;
  } 


  @PostMapping( value = "create", produces = MediaType.APPLICATION_JSON_VALUE )
  public String create() {
      
        return service.create("mitomano", "gunns & rooses" );

  } 
  
}
