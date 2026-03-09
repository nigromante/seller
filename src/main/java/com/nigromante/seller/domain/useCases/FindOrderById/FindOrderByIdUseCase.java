/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nigromante.seller.domain.useCases.FindOrderById;

import com.nigromante.seller.domain.entities.Order;
import com.nigromante.seller.application.repositories.OrderRepository;
import com.nigromante.seller.domain.useCases.CreateOrder.CreateOrderCommand;
import com.nigromante.seller.domain.useCases.CreateOrder.CreateOrderMapper;

/**
 *
 * @author julian
 */
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
