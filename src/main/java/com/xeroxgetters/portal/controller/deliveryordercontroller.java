package com.xeroxgetters.portal.controller;

import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.service.deliveryorderservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery/orders")
public class deliveryordercontroller {

    private final deliveryorderservice deliveryorderservice;

    public deliveryordercontroller(deliveryorderservice deliveryorderservice) {
        this.deliveryorderservice = deliveryorderservice;
    }

    @PutMapping("/{orderId}/deliver")
    public order deliverOrder(
            @PathVariable Long orderId,
            @RequestParam Long deliveryUserId) {

        return deliveryorderservice.markAsDelivered(orderId, deliveryUserId);
    }
}
