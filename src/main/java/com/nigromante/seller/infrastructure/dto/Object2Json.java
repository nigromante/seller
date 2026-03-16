
package com.nigromante.seller.infrastructure.dto;

import tools.jackson.databind.ObjectMapper;


public class Object2Json {

    public static String Map( Object object ) {

        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString( object );
    }

}
