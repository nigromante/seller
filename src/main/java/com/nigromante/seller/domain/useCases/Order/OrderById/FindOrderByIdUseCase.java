
package com.nigromante.seller.domain.useCases.Order.OrderById;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.application.repositories.OrderRepository;

public class FindOrderByIdUseCase {
    OrderRepository orderRepository;

    public FindOrderByIdUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public Order run( String orderId ) { 
        try {
            Order order = this.orderRepository.findByOrderId(orderId) ;
            return order;
        }catch (Exception ex ) {
             System.out.println( "CreateOrderUseCase : " + ex.getMessage() );
        }
        return null ;
    }

}
