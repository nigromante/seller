

package com.nigromante.seller.application.mapping;

import com.nigromante.seller.application.dto.OrderDTO;
import com.nigromante.seller.domain.entities.Order;
import tools.jackson.databind.ObjectMapper;


public class OrderMapping {
    
    public static String Map( Order order ) {

        OrderDTO orderDTO = OrderDTO
                .builder()
                .orderId( order.getOrderId().Value() )
                .customerId( order.getCustomerId().Value() )
                .build();

        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(orderDTO );        
    }

}
