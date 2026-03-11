
package com.nigromante.seller.domain.useCases.Order.Create;

import com.nigromante.seller.domain.entities.Order;

public class CreateOrderMapper {

    public static Order Map(  CreateOrderCommand command ) throws Exception {
        try {
            Order order = new Order ( command.getOrderId() , command.getCustomerId() );
            return( order );

        }
        catch( Exception ex ) {
            System.out.println( "CreateOrderMapper : " + ex.getMessage() );
            throw ex;
        }
    }

}

