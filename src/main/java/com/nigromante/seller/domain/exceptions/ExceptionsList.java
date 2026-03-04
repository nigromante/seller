/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nigromante.seller.domain.exceptions;

import java.util.*;

/**
 *
 * @author julian
 */
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
