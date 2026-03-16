
package com.nigromante.seller.infrastructure.dto;

import lombok.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@ToString
public class OrderDTO {

  private @NonNull String orderId;
  private @NonNull String customerId;

}

