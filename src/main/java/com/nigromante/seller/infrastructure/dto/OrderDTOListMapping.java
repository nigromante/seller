
package com.nigromante.seller.infrastructure.dto;

import com.nigromante.seller.domain.entities.Order;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class OrderDTOListMapping {

    public static List<OrderDTO> Map( List<Order> orders ) {

        ModelMapper mmapper = new ModelMapper();
        List<OrderDTO> orderDTOs = new ArrayList<OrderDTO>();
        for( Order order : orders ){
            orderDTOs.add( mmapper.map( order , OrderDTO.class) ) ;
        }
        return  orderDTOs ;
    }

}
