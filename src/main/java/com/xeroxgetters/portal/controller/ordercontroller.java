package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.dto.placeorderrequest;
import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.service.orderservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class ordercontroller {

    private final orderservice orderService;

    public ordercontroller(orderservice orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/place")
    public order placeOrder(@RequestBody placeorderrequest request) {
        return orderService.placeorder(request);
    }
}
