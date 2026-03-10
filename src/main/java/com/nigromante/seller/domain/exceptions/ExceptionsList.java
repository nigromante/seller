
package com.nigromante.seller.domain.exceptions;

import java.util.*;

public class ExceptionsList {
    
    List<String> list = new ArrayList<>();
    
    public void Add( String varName, String message ) {
        list.add( varName + " : "  + message ) ;
    }
    
    public void Throw() throws Exception {
        if( list.isEmpty() )
            return ;
        
        throw new CollectionException( list );
    }
    
}
