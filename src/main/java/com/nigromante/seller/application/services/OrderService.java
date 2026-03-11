
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.useCases.Order.*;
import com.nigromante.seller.application.repositories.OrderRepository;
import com.nigromante.seller.domain.entities.Order;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class OrderService implements OrderServiceInterface {
    
    private final OrderRepository orderRepository ;

    
    public OrderService( OrderRepository orderRepository ) {
        this.orderRepository = orderRepository ;
    }
   

    @Override
    public Order create( CreateOrderCommand orderCommand ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( this.orderRepository );

        return useCase.run( orderCommand );
    }


    @Override
    public List<Order> list( ) {
        ListOrderUseCase useCase = new ListOrderUseCase( this.orderRepository ) ;
        
        return useCase.run( );
    }


    @Override
    public Order find( String orderId ){

        FindOrderByIdUseCase useCase = new FindOrderByIdUseCase( this.orderRepository );

        return useCase.run( orderId );
    }


}

