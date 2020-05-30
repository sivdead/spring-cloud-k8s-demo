package com.example.order.service.api;


import com.example.order.service.dto.AddOrderDto;
import com.example.order.service.fallback.OrderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        path = "/v1/order",
        name = "${service.order.name:order-service}",
        fallback = OrderFallback.class
)
public interface OrderApi {

    @PostMapping
    ResponseEntity<String> submitOrder(@RequestBody AddOrderDto addOrderDto);
}
