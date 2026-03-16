
package com.nigromante.seller.domain.entities;

import com.nigromante.seller.domain.exceptions.ExceptionsList;
import com.nigromante.seller.domain.objects.*;


public final class Order {

  private Code orderId;
  private Code customerId;

  public Order( String orderId, String customerId ) throws Exception{

      ExceptionsList exList = new ExceptionsList() ; 

      try {
        this.orderId = Code.Of(orderId);
      } catch( Exception ex ){
        exList.Add("orderId" , ex.getMessage() );
      }

      try {
        this.customerId = Code.Of(customerId);
      } catch( Exception ex ){
        exList.Add("customerId" , ex.getMessage() );
      }

      exList.Throw();
  }


  public String getOrderId() {
      return this.orderId.Value();
  }


  public String getCustomerId() {
      return this.customerId.Value();
  }


}
