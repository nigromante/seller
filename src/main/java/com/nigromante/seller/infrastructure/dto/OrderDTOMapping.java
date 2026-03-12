

package com.nigromante.seller.infrastructure.dto;

import com.nigromante.seller.domain.entities.Order;
import tools.jackson.databind.ObjectMapper;


public class OrderDTOMapping {

    public static OrderDTO Order2DTO( Order order ) {
        return OrderDTO
                .builder()
                .orderId( order.getOrderId() )
                .customerId( order.getCustomerId() )
                .build();
    }
    
    public static String Map( Order order ) {
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(OrderDTOMapping.Order2DTO( order ) );        
    }

}
