package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.dto.assigndeliveryrequest;
import com.xeroxgetters.portal.dto.updateorderstatusrequest;
import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.service.shoporderservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop/orders")
public class shopordercontroller {

    private final shoporderservice shoporderservice;

    public shopordercontroller(shoporderservice shopOrderService) {
        this.shoporderservice = shopOrderService;
    }

    // 1️⃣ View all orders
    @GetMapping
    public List<order> getAllOrders() {
        return shoporderservice.getAllOrders();
    }

    // 2️⃣ Update order status
    @PutMapping("/{orderId}/status")
    public order updateStatus(
            @PathVariable Long orderId,
            @RequestBody updateorderstatusrequest request) {

        return shoporderservice.updateOrderStatus(orderId, request.getStatus());
    }

    @PutMapping("/{orderId}/assign-delivery")
    public order assignDelivery(
            @PathVariable Long orderId,
            @RequestBody assigndeliveryrequest request) {

        return shoporderservice.assignDelivery(orderId, request.getDeliveryUserId());
    }

}
