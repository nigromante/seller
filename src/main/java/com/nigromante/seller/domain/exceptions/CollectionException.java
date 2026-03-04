/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nigromante.seller.domain.exceptions;

import java.util.List;

/**
 *
 * @author julian
 */
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
