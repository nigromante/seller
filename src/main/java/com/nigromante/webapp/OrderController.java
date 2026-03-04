package com.nigromante.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.nigromante.seller.application.services.*;

@RestController
public class OrderController {
    
  @GetMapping("/order")
  public String list() {
      
      OrderService service = new OrderServiceImpl(); 
        List<String> result = service.list();
      
    return "saludos desde (GET /order): " + this.getClass().getName();
  } 

  @PostMapping("/order")
  public String create() {
      
        OrderService service = new OrderServiceImpl(); 
        int tt = service.create("mit", "gnn");
      
    return "saludos desde (POST /order): " + this.getClass().getName();
  } 
  
}
