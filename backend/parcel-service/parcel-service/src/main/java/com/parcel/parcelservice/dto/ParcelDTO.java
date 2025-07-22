package com.parcel.parcelservice.dto;

public class ParcelDTO {

    private String trackingId;
    private String senderName;
    private String receiverName;
    private String originAddress;
    private String destinationAddress;

    // Constructors
    public ParcelDTO() {
    }

    public ParcelDTO(String trackingId, String senderName, String receiverName, String originAddress, String destinationAddress) {
        this.trackingId = trackingId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
    }

    // Getters and Setters

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
}
