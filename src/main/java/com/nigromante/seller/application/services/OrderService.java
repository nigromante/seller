package com.nigromante.seller.application.services;

import java.util.List;

public interface OrderService {

    public int create( String orderId, String customerId );

    public List<String> list() ;
}

