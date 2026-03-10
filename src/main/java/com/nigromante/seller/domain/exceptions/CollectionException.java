
package com.nigromante.seller.domain.exceptions;

import java.util.List;


public class CollectionException extends Exception {

    private String newMessage = "" ; 
    
        public CollectionException( List<String> list ) {
            super(  );
        
            StringBuilder sb = new StringBuilder();
            sb.append( "Multiple exceptions\n" ) ;
            for( String str : list ) {
                sb.append("\n") ;
                sb.append(str) ;
            }
            sb.append("\n") ;
            this.newMessage = sb.toString() ; 
        
    }
    
    public String getMessage() {
        return this.newMessage;
    }
        
}
