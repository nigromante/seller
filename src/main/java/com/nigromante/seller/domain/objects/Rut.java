
package com.nigromante.seller.domain.objects;
import com.nigromante.seller.domain.exceptions.RutInvalidException;

public final class Rut  {

  private String value;

  public static Rut Of( String value ) throws Exception {
      return new Rut(value);
  }
  
  private Rut( String value ) throws Exception {
    if( ! this.ensureValue( value) ) {
      throw new RutInvalidException();
    }
    this.value = value;
  }

  
  private boolean ensureValue( String value ) {
    if( value.length() < 4 )
      return false;

    return  true;
  }

  
  public String Value() {
      return this.value;
  }

} 
