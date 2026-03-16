
package com.nigromante.seller.infrastructure.controllers;

import com.nigromante.seller.infrastructure.dto.OrderDTOMapping;
import com.nigromante.seller.infrastructure.dto.OrderDTOListMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.nigromante.seller.application.services.*;
import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.domain.useCases.Order.CreateOrderCommand;
import com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping( value = "order" )
public class OrderController {

  private OrderService service;

  public OrderController() {
      this.service = new OrderService( new OrderRepositoryMysql() ) ;
  }


  @PostMapping( value="getall", produces = MediaType.APPLICATION_JSON_VALUE )
  public String list() {

    List<Order> orders = service.list( );
    return OrderDTOListMapping.Map( orders );
  }


  @PostMapping( value="find", produces = MediaType.APPLICATION_JSON_VALUE )
  public String find( @RequestParam String orderId ) {

    Order order =  service.find( orderId );
    return OrderDTOMapping.Map(order);
  }


  @PostMapping( value = "create", produces = MediaType.APPLICATION_JSON_VALUE )
  public String create( @RequestBody CreateOrderCommand cmd ) {

    Order order = service.create( cmd );
    return OrderDTOMapping.Map(order);
  }


}
