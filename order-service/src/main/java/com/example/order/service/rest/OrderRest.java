package com.example.order.service.rest;

import com.example.order.service.api.OrderApi;
import com.example.order.service.dto.AddOrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderRest implements OrderApi {


    @Override
    public ResponseEntity<String> submitOrder(@RequestBody AddOrderDto addOrderDto) {
        return ResponseEntity.ok("123");
    }
}
