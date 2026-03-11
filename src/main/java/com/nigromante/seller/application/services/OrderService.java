
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.useCases.Order.OrderList.OrderListUseCase;
import com.nigromante.seller.domain.useCases.Order.Create.CreateOrderUseCase;
import com.nigromante.seller.domain.useCases.Order.Create.CreateOrderCommand;
import com.nigromante.seller.application.mapping.OrderMapping;
import com.nigromante.seller.application.repositories.OrderRepository;
import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.domain.useCases.Order.OrderById.FindOrderByIdUseCase;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class OrderService implements OrderServiceInterface {
    
    private final OrderRepository orderRepository ;

    
    public OrderService( OrderRepository orderRepository ) {
        this.orderRepository = orderRepository ;
    }
   

    @Override
    public String create(  CreateOrderCommand orderCommand ) { 
    
        CreateOrderUseCase useCase = new CreateOrderUseCase( this.orderRepository );

        Order order = useCase.run( orderCommand );
        
        return OrderMapping.Map(order);
    }


    @Override
    public String list() {
        OrderListUseCase useCase = new OrderListUseCase( this.orderRepository ) ;
        
        List<Order> result = useCase.run( );

        
        return "";
    }


    @Override
    public String find( String orderId ){

        FindOrderByIdUseCase useCase = new FindOrderByIdUseCase( this.orderRepository );

        Order order = useCase.run(  orderId );

        return OrderMapping.Map(order);
    }


}

