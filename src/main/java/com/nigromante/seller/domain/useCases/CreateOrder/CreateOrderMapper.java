
package com.nigromante.seller.domain.useCases.CreateOrder;

import com.nigromante.seller.domain.entities.Order;

public class CreateOrderMapper {

    public static Order Map(  CreateOrderCommand command ) throws Exception {
        try {
            Order order = new Order ( command.orderId , command.customerId );
            return( order );

        }
        catch( Exception ex ) {
            System.out.println( "CreateOrderMapper : " + ex.getMessage() );
            throw ex;
        }
    }

}

