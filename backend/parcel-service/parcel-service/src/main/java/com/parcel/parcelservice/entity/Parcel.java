package com.parcel.parcelservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String trackingId;

    private String senderName;
    private String receiverName;
    private String originAddress;
    private String destinationAddress;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdAt;

    // Enum for parcel status
    public enum Status {
        PENDING, SHIPPED, DELIVERED
    }

    // Constructors
    public Parcel() {
    }

    public Parcel(String trackingId, String senderName, String receiverName,
                  String originAddress, String destinationAddress, Status status, LocalDateTime createdAt) {
        this.trackingId = trackingId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
