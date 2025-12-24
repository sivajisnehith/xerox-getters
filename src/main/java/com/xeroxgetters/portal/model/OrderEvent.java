package com.xeroxgetters.portal.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "order_events")
public class OrderEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String event;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "order_id")

    private order order;

    public Long getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public order getOrder() {
        return order;
    }

    public void setOrder(order order) {
        this.order = order;
    }
}
