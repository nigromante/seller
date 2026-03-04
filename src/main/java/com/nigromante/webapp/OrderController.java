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
      
      OrderListService service = new OrderListServiceImpl(); 
        List<String> result = service.call();
      
    return "saludos desde (GET /order): " + this.getClass().getName();
  } 

  @PostMapping("/order")
  public String create() {
      
        CreateOrderService service = new CreateOrderServiceImpl(); 
        int tt = service.call("mit", "gnn");
      
    return "saludos desde (POST /order): " + this.getClass().getName();
  } 
  
}
