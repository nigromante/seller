
package com.nigromante.seller.application.services;

import com.nigromante.seller.domain.useCases.Order.Create.CreateOrderCommand;


public interface OrderServiceInterface {

    public String create(  CreateOrderCommand orderCommand ) ; 

    public String list() ;

    public String find( String orderId ) ;

}

