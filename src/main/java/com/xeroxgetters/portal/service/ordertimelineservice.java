package com.xeroxgetters.portal.service;

import com.xeroxgetters.portal.dto.ordertimelineresponse;
import com.xeroxgetters.portal.model.OrderEvent;
import com.xeroxgetters.portal.repository.ordereventrepository;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ordertimelineservice {

    private final ordereventrepository ordereventrepository;

    public ordertimelineservice(ordereventrepository ordereventrepository) {
        this.ordereventrepository = ordereventrepository;
    }

    public List<ordertimelineresponse> getTimeline(Long orderId) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        List<OrderEvent> events =
                ordereventrepository.findByOrderIdOrderByCreatedAtAsc(orderId);

        return events.stream()
                .map(e -> new ordertimelineresponse(
                        e.getCreatedAt().format(formatter),
                        e.getEvent()
                ))
                .collect(Collectors.toList());
    }
}
