
package com.nigromante.seller.infrastructure.dto;

import lombok.*;


@Getter
@Setter
@Data
@ToString
public class OrderDTO {

  private @NonNull String orderId;
  private @NonNull String customerId;
  
  public OrderDTO(){}
    
  
}

