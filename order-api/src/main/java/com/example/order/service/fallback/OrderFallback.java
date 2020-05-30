package com.example.order.service.fallback;

import com.example.order.service.api.OrderApi;
import com.example.order.service.dto.AddOrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderFallback implements OrderApi {


    @Override
    public ResponseEntity<String> submitOrder(AddOrderDto addOrderDto) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("error");
    }
}
