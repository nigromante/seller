
package com.nigromante.seller.domain.useCases.Order.OrderList;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.application.repositories.OrderRepository;
import java.util.List;

public class OrderListUseCase {
    OrderRepository orderRepository;

    public OrderListUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public List<Order> run( ) { 
        try {
            List<Order> orders = this.orderRepository.getAll() ;
            return orders;
        }catch (Exception ex ) {
             System.out.println( "CreateOrderUseCase : " + ex.getMessage() );
        }
        return null ;
    }

}
