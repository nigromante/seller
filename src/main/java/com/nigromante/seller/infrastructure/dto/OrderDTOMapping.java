
package com.nigromante.seller.infrastructure.dto;

import com.nigromante.seller.domain.entities.Order;
import org.modelmapper.ModelMapper;


public class OrderDTOMapping{

    public static OrderDTO  Map( Order order ) {

        ModelMapper mmapper = new ModelMapper();
        return mmapper.map( order, OrderDTO.class );
    }

}
