
package com.nigromante.app;

import com.nigromante.seller.application.services.*;

public class Seller {

    public static void start(String[] args) {

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Seller : DDD structure");
        
        CreateOrderService service = new CreateOrderServiceImpl(); 
        int tt = service.call("mit", "gnn");

        System.out.println( "Returns : " + tt);
        System.out.println("-----------------------------------------------------------------------");

    }

}
