
package com.nigromante.seller.domain.entities;

import com.nigromante.seller.domain.exceptions.CollectionException;
import com.nigromante.seller.domain.exceptions.ExceptionsList;
import com.nigromante.seller.domain.objects.*;

public final class Order {

  private Code orderId;
  private Code customerId;

  public Order( String orderId, String customerId ) throws Exception{

      ExceptionsList exList = new ExceptionsList() ; 

      try {
        this.orderId = new Code(orderId);
      } catch( Exception ex ){
        exList.Add("orderId" , ex.getMessage() );
      }      
      
      try {
        this.customerId = new Code(customerId);
      } catch( Exception ex ){
        exList.Add("customerId" , ex.getMessage() );
      }

      exList.Throw();
  }

    public Code getOrderId() {
        return orderId;
    }

    public Code getCustomerId() {
        return customerId;
    }

}
