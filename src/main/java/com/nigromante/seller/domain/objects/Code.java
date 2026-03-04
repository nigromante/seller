
package com.nigromante.seller.domain.objects;
import com.nigromante.seller.domain.exceptions.CodeInvalidException;
import java.io.IOException;

public final class Code  {

  private String value;
  private String customerId;

  public Code( String value ) throws Exception {
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
} 
