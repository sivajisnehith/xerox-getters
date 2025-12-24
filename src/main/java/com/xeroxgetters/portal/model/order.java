package com.xeroxgetters.portal.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "orders")
public class order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int pages;
    private int copies;
    private boolean color;
    private int price;
    private String status;

    private LocalDateTime createdAt;

    @ManyToOne
    
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private user user;

    @ManyToOne
    @JoinColumn(name = "delivery_user_id")
    @JsonIgnore
    private user deliveryUser;

    // getters & setters

    public Long getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }
    public user getDeliveryUser() {
        return deliveryUser;
    }
    
    public void setDeliveryUser(user deliveryUser) {
        this.deliveryUser = deliveryUser;
    }
    
}
