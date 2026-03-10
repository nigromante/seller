
package com.nigromante.seller.application.dto;

import lombok.*;


@Getter
@Builder
@ToString
public final class OrderDTO {

  private final @NonNull String orderId;
  private final @NonNull String customerId;

}
