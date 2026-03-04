package com.nigromante.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.nigromante.seller.application.services.*;

@RestController
public class HelloController {
    
  @GetMapping("/")
  public String index() {
      
      OrderListService service = new OrderListServiceImpl(); 
        List<String> result = service.call();
      
    return "saludos desde (index): " + this.getClass().getName();
  } 

  @GetMapping("/createorder")
  public String createOrder() {
      
        CreateOrderService service = new CreateOrderServiceImpl(); 
        int tt = service.call("mit", "gnn");
      
    return "saludos desde (createorder): " + this.getClass().getName();
  } 
  
}
