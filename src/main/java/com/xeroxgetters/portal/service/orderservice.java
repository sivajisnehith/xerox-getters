package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.dto.placeorderrequest;
import com.xeroxgetters.portal.model.order;
import com.xeroxgetters.portal.model.user;
import com.xeroxgetters.portal.repository.orderrepository;
import com.xeroxgetters.portal.repository.UserRepository;
import com.xeroxgetters.portal.repository.ordereventrepository;
import org.springframework.stereotype.Service;
import com.xeroxgetters.portal.model.OrderEvent;
import java.time.LocalDateTime;

@Service    
public class orderservice {
    private final ordereventrepository ordereventrepository;
    private final orderrepository orderrepository;
    private final UserRepository userrepository;
   
    public orderservice(orderrepository orderRepository,
                        UserRepository userRepository, ordereventrepository ordereventrepository) {
        this.orderrepository = orderRepository;
        this.userrepository = userRepository;
        this.ordereventrepository = ordereventrepository;
    }

    public order placeorder(placeorderrequest request) {

        user user = userrepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        order order = new order();
        order.setUser(user);
        order.setPages(request.getPages());
        order.setCopies(request.getCopies());
        order.setColor(request.isColor());

        // simple pricing logic
        int pricePerPage = request.isColor() ? 5 : 2;
        int totalPrice = request.getPages() * request.getCopies() * pricePerPage;

        order.setPrice(totalPrice);
        order.setStatus("PLACED");
        order.setCreatedAt(LocalDateTime.now());


        order savedOrder = orderrepository.save(order);

        // 🔥 EVENT LOG — PASTE EXACTLY HERE
        OrderEvent event = new OrderEvent();
        event.setOrder(savedOrder);
        event.setEvent("Order Placed");
        event.setCreatedAt(LocalDateTime.now());
        ordereventrepository.save(event);
        
        // return final result
        return savedOrder;
        
    }
}
