package net.javaguides.orderservice.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

    @Data
    public class OrderRequest {
        @NotNull
        private Long userId;

        @NotNull
        private Double totalAmount;
    }

