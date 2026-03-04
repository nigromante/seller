
package com.nigromante.seller.domain.useCases.CreateOrder;


public class CreateOrderCommand {

    String orderId;
    String customerId;

    public CreateOrderCommand( String orderId, String customerId ) {

      this.orderId = orderId ;
      this.customerId = customerId;

    }

}

