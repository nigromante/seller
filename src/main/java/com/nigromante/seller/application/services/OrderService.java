
package com.nigromante.seller.application.services;

import com.nigromante.seller.application.repositories.OrderRepository;
import com.nigromante.seller.domain.entities.Order;
import  com.nigromante.seller.domain.useCases.CreateOrder.*;
import  com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService implements OrderServiceInterface {
    
    private OrderRepository orderRepository ;

    
    public OrderService( ) {
        this.orderRepository = new OrderRepositoryMysql();
       
    }
    
    @Override
    public int create( String orderId, String customerId ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( this.orderRepository );

        Order order = useCase.run( new CreateOrderCommand(orderId , customerId) );
        useCase = null;

        return 0;
    }

    @Override
    public List<String> list() {
        
        List<String> result = new ArrayList<>();
        
        return result;
    }

    @Override
    public String getById( String orderId ){
      return "";
    }

}

