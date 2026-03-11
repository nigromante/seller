
package com.nigromante.seller.domain.useCases.Order;

import lombok.*;

@RequiredArgsConstructor
@Getter
public class CreateOrderCommand {

    private final String orderId;
    private final String customerId;
}

