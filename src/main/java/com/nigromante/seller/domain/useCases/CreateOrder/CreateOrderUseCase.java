

package com.nigromante.seller.domain.useCases.CreateOrder;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.domain.repositories.OrderRepository;

public class CreateOrderUseCase {
    OrderRepository orderRepository;

    public CreateOrderUseCase(OrderRepository orderRepository) {
      this.orderRepository = orderRepository ;
    }

    public Order run( CreateOrderCommand command ) { 
        try {
            Order order = CreateOrderMapper.Map( command );  
            this.orderRepository.save( order ) ; 
            return order;
        }catch (Exception ex ) {
             System.out.println( "CreateOrderUseCase : " + ex.getMessage() );
        }
        return null ;
    }

}

