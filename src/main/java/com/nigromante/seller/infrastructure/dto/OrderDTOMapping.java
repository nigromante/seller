

package com.nigromante.seller.infrastructure.dto;

import com.nigromante.seller.domain.entities.Order;
import org.modelmapper.ModelMapper;
import tools.jackson.databind.ObjectMapper;


public class OrderDTOMapping {

    
    public static String Map( Order order ) {
        
        ModelMapper mmapper = new ModelMapper();
        
        mmapper
                .typeMap( Order.class, OrderDTO.class)
                .addMappings( 
                    mapper -> {
                        mapper.map( src -> src.getOrderId()    , OrderDTO::setOrderId);
                        mapper.map( src -> src.getCustomerId() , OrderDTO::setCustomerId);
                    }
                );
        OrderDTO orderDTO = mmapper.map(order, OrderDTO.class);
        
        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString( orderDTO );        
    }

}
