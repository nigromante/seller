
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.entities.Order;
import  com.nigromante.seller.domain.useCases.CreateOrder.*;
import  com.nigromante.seller.infrastructure.repositories.OrderRepositoryMysql;

public class CreateOrderServiceImpl implements CreateOrderService {

    public int call( String orderId, String customerId ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( new OrderRepositoryMysql() );

        Order order = useCase.run( new CreateOrderCommand(orderId , customerId) );
        useCase = null;

        return 0;
    }

}

