package com.nigromante.seller.application.services;

import java.util.List;

public interface OrderServiceInterface {

    public int create( String orderId, String customerId );

    public List<String> list() ;

    public String getById( String orderId );

}

