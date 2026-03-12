
package com.nigromante.seller.domain.entities;

import com.nigromante.seller.domain.exceptions.ExceptionsList;
import com.nigromante.seller.domain.objects.Code;
import com.nigromante.seller.domain.objects.Name;
import com.nigromante.seller.domain.objects.Rut;

public class Customer {
    
      private Code  customerId;
      private Rut   rutNumber;
      private Name  nombre;

      public Customer( String customerId, String rutNumber ) throws Exception{

      ExceptionsList exList = new ExceptionsList() ; 

      try {
        this.rutNumber = Rut.Of(rutNumber);
      } catch( Exception ex ){
        exList.Add("rutNumber" , ex.getMessage() );
      }      
      
      try {
        this.customerId = Code.Of(customerId);
      } catch( Exception ex ){
        exList.Add("customerId" , ex.getMessage() );
      }
      
      try {
        this.nombre = Name.Of(rutNumber);
      } catch( Exception ex ){
        exList.Add("nombre" , ex.getMessage() );
      }      

      exList.Throw();
  }

    public String getCustomerId() {
        return this.customerId.Value();
    }
    
    public String getRutNumber() {
        return this.rutNumber.Value();
    }

    public String getNombre() {
        return this.nombre.Value();
    }

    
}
