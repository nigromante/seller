
package com.nigromante.seller.infrastructure.dto;

import lombok.*;


@Getter
@Builder
@ToString
public final class OrderDTO {

  private final @NonNull String orderId;
  private final @NonNull String customerId;

}
