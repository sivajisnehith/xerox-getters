package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.UserRepository;
import com.xeroxgetters.portal.repository.orderrepository;
import org.springframework.stereotype.Service;
import com.xeroxgetters.portal.model.OrderEvent;
import com.xeroxgetters.portal.repository.ordereventrepository;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class shoporderservice {
    
    private final orderrepository orderrepository;
    private final UserRepository UserRepository;
    private final ordereventrepository ordereventrepository;

    public shoporderservice(orderrepository orderrepository,UserRepository UserRepository,ordereventrepository ordereventrepository) {
        this.orderrepository = orderrepository;
        this.UserRepository = UserRepository;
        this.ordereventrepository = ordereventrepository;
    }
    
    // 1️⃣ View all orders
    public List<order> getAllOrders() {
        return orderrepository.findAll();
    }

    // 2️⃣ Update order status
    public order updateOrderStatus(Long orderId, String newStatus) {
        
        order order = orderrepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        String current = order.getStatus();

        // 🔒 Enforce workflow
        if (current.equals("PLACED") && newStatus.equals("PRINTING")) {
            order.setStatus(newStatus);
        } else if (current.equals("PRINTING") && newStatus.equals("READY_FOR_DELIVERY")) {
            order.setStatus(newStatus);
        } else {
            throw new RuntimeException(
                    "Invalid status transition: " + current + " → " + newStatus
            );
        }
       

        order savedOrder = orderrepository.save(order);
        logEvent(savedOrder, "Status changed to " + newStatus);
        return savedOrder;
    }

    public order assignDelivery(Long orderId, Long deliveryUserId) {

        order order = orderrepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    
        if (!order.getStatus().equals("READY_FOR_DELIVERY")) {
            throw new RuntimeException("Order not ready for delivery");
        }
    
        user deliveryUser = UserRepository.findById(deliveryUserId)
        .orElseThrow(() -> new RuntimeException("Delivery user not found"));

        if (!deliveryUser.getRole().equals("DELIVERY")) {
            throw new RuntimeException("User is not a delivery person");
        }
    
        order.setDeliveryUser(deliveryUser);
        order.setStatus("OUT_FOR_DELIVERY");
    
        order savedOrder = orderrepository.save(order);
        logEvent(savedOrder, "Assigned to delivery user ID " + deliveryUser.getId());
        return savedOrder;

    }
    private void logEvent(order order, String message) {

        OrderEvent event = new OrderEvent();
        event.setOrder(order);
        event.setEvent(message);
        event.setCreatedAt(LocalDateTime.now());
    
        ordereventrepository.save(event);
    }
    
}
