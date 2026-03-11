package com.nigromante.seller.infrastructure.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.nigromante.seller.application.services.*;
import com.nigromante.seller.domain.useCases.Order.Create.CreateOrderCommand;


@RestController
@RequestMapping( value = "order" )
public class OrderController {

  @Autowired 
  private OrderService service;

  
  @PostMapping( value="getall", produces = MediaType.APPLICATION_JSON_VALUE )
  public String list() {
      
    return service.list();
  } 


  @PostMapping( value="find", produces = MediaType.APPLICATION_JSON_VALUE )
  public String find( @RequestParam String orderId ) {
      
    return service.find( orderId );
  } 


  @PostMapping( value = "create", produces = MediaType.APPLICATION_JSON_VALUE )
  public String create() {
      
    CreateOrderCommand cmd = CreateOrderCommand
            .builder()
            .orderId("nigromante")
            .customerId("velociraptor")
            .build();
    
    return service.create( cmd );
  } 
  
}
