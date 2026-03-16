
package com.nigromante.seller.application.services;

import com.nigromante.seller.application.repositories.OrderRepository;


public abstract class BaseService {

    protected OrderRepository orderRepository ;

    public BaseService( OrderRepository orderRepository ) {
        this.orderRepository = orderRepository ;
    }

    public OrderRepository getRepository() {
        return this.orderRepository ;
    } 

} 
