
package com.nigromante.seller.domain.objects;

import com.nigromante.seller.domain.exceptions.CodeInvalidException;


public final class Code  {

  private String value;

  public static Code Of( String value) throws Exception {
      return new Code( value ) ;
  }

  private Code( String value ) throws Exception {
    if( ! this.ensureValue( value) ) {
      throw new CodeInvalidException();
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
