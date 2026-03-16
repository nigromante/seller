
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.useCases.Order.*;
import com.nigromante.seller.application.repositories.OrderRepository;
import com.nigromante.seller.domain.entities.Order;

import java.util.List;

public class OrderService extends BaseService implements OrderServiceInterface {


    public OrderService( OrderRepository orderRepository ) {
        super( orderRepository ) ;
    }


    @Override
    public Order create( CreateOrderCommand orderCommand ) { 

        CreateOrderUseCase useCase = new CreateOrderUseCase( this.getRepository() );

        return useCase.run( orderCommand );
    }


    @Override
    public List<Order> list( ) {
        ListOrderUseCase useCase = new ListOrderUseCase( this.getRepository() ) ;

        return useCase.run( );
    }


    @Override
    public Order find( String orderId ){

        FindOrderByIdUseCase useCase = new FindOrderByIdUseCase( this.getRepository() );

        return useCase.run( orderId );
    }


}

