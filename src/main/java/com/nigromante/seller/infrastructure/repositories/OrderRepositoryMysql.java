
package com.nigromante.seller.infrastructure.repositories;

import com.nigromante.seller.application.repositories.OrderRepository; 
import com.nigromante.seller.domain.entities.Order;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class OrderRepositoryMysql implements OrderRepository {
    

    @Override
    public boolean save(Order order){
         System.out.println("OrderRepositoryMysql :: save");
        return true;
    }


    @Override
    public Order findByOrderId(String orderId) {
        System.out.println("OrderRepositoryMysql :: findByOrderId");
        try {
            Order order = new Order("demostenes" , "otrocasodeuso");
            return order;
        } catch (Exception ex) {
            System.getLogger(OrderRepositoryMysql.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null ;
    }


    @Override
    public List<Order> getAll() {
        System.out.println("OrderRepositoryMysql :: findByOrderId");
        try {
            List<Order> orders = new ArrayList<Order>(); ;
            return orders;
        } catch (Exception ex) {
            System.getLogger(OrderRepositoryMysql.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null ;
    }


}
