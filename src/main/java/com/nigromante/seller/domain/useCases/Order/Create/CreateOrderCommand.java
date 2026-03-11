
package com.nigromante.seller.domain.useCases.Order.Create;

import lombok.*;

@Data
@Builder
@Getter
public class CreateOrderCommand {

    private String orderId;
    private String customerId;
}

