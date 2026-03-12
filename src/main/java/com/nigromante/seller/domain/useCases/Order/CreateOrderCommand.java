
package com.nigromante.seller.domain.useCases.Order;



public class CreateOrderCommand {

    private final String orderId;
    private final String customerId;
    
    public CreateOrderCommand( String orderId , String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }
    
    public String getOrderId() {
        return this.orderId;
    }
    
    public String getCustomerId() {
        return this.customerId;
    }

}

