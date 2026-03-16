
package com.nigromante.seller.domain.objects;

import com.nigromante.seller.domain.exceptions.NameInvalidException;


public final class Name  {

  private String value;

  public static Name Of( String value) throws Exception {
      return new Name( value ) ;
  }

  private Name( String value ) throws Exception {
    if( ! this.ensureValue( value) ) {
      throw new NameInvalidException();
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
