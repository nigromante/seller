

package com.nigromante.seller.domain.repositories;

import com.nigromante.seller.domain.entities.Order;

public interface OrderRepository {

    boolean  save(Order order);

    Order findByOrderId( String orderId ) ;
}
