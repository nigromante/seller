
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.domain.useCases.Order.CreateOrderCommand;
import java.util.List;


public interface OrderServiceInterface {

    public Order create( CreateOrderCommand orderCommand ) ; 

    public List<Order> list( ) ;

    public Order find( String orderId ) ;

}

