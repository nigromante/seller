
package com.nigromante.seller.domain.entities;

import com.nigromante.seller.domain.exceptions.ExceptionsList;
import com.nigromante.seller.domain.objects.Code;
import com.nigromante.seller.domain.objects.Rut;
import lombok.Getter;

@Getter
public class Customer {
    
      private Code  customerId;
      private Rut   rutNumber;
      private String nombre;

      public Customer( String customerId, String rutNumber ) throws Exception{

      ExceptionsList exList = new ExceptionsList() ; 

      try {
        this.rutNumber = Rut.of(rutNumber);
      } catch( Exception ex ){
        exList.Add("rutNumber" , ex.getMessage() );
      }      
      
      try {
        this.customerId = Code.of(customerId);
      } catch( Exception ex ){
        exList.Add("customerId" , ex.getMessage() );
      }

      exList.Throw();
  }

      
}
