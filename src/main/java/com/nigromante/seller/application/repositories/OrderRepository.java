
package com.nigromante.seller.application.repositories;

import com.nigromante.seller.domain.entities.Order;
import java.util.List;

public interface OrderRepository {

    boolean  save(Order order);

    Order findByOrderId( String orderId ) ;

    List<Order> getAll();

}

