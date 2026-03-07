
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.entities.Order;
import  com.nigromante.seller.domain.useCases.CreateOrder.*;
import  com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public int create( String orderId, String customerId ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( new OrderRepositoryMysql() );

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

