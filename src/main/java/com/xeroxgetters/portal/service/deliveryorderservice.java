package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.repository.orderrepository;
import com.xeroxgetters.portal.repository.ordereventrepository;
import org.springframework.stereotype.Service;
import com.xeroxgetters.portal.model.OrderEvent;
import java.time.LocalDateTime;

@Service
public class deliveryorderservice {

    private final orderrepository orderrepository;
    private final ordereventrepository ordereventrepository;
    

    public deliveryorderservice(orderrepository orderrepository,
                                ordereventrepository ordereventrepository) {
        this.orderrepository = orderrepository;
        this.ordereventrepository = ordereventrepository;
    }

    public order markAsDelivered(Long orderId, Long deliveryUserId) {

        order order = orderrepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        // 🔒 validation
        if (!order.getStatus().equals("OUT_FOR_DELIVERY")) {
            throw new RuntimeException("Order is not out for delivery");
        }

        if (order.getDeliveryUser() == null ||
                !order.getDeliveryUser().getId().equals(deliveryUserId)) {
            throw new RuntimeException("This order is not assigned to you");
        }

        // ✅ update status
        order.setStatus("DELIVERED");
        order savedOrder = orderrepository.save(order);

        OrderEvent event = new OrderEvent();
        event.setOrder(savedOrder);
        event.setEvent("Order Delivered");
        event.setCreatedAt(LocalDateTime.now());
        ordereventrepository.save(event);

        return savedOrder;
    }

    
    
}
