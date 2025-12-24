package com.xeroxgetters.portal.repository;

import com.xeroxgetters.portal.model.OrderEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ordereventrepository extends JpaRepository<OrderEvent, Long> {
    List<OrderEvent> findByOrderIdOrderByCreatedAtAsc(Long orderId);
}