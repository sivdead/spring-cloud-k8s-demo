package com.example.order.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderDto {

    private String itemName;

    private Long itemNum;

    private Long itemPrice;

    private String username;
}
