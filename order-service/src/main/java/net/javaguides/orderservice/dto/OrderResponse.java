package net.javaguides.orderservice.dto;

import lombok.Builder;
import lombok.Data;
import net.javaguides.orderservice.model.OrderStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class OrderResponse {
    private Long id;
    private UUID orderNumber;
    private Long userId;
    private Double totalAmount;
    private OrderStatus status;
    private LocalDateTime orderDate;
}
