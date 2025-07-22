package com.parcel.parcelservice.service;

import com.parcel.parcelservice.dto.ParcelDTO;
import com.parcel.parcelservice.entity.Parcel;
import com.parcel.parcelservice.entity.Parcel.Status;
import com.parcel.parcelservice.repo.ParcelRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ParcelService {

    @Autowired
    private ParcelRepo parcelRepo;

    // Get all parcels
    public List<Parcel> getAllParcels() {
        return parcelRepo.findAll();
    }

    // Get a parcel by tracking ID
    public Optional<Parcel> getParcelByTrackingId(String trackingId) {
        return parcelRepo.findByTrackingId(trackingId);
    }

    // Create a new parcel
    public Parcel createParcel(ParcelDTO dto) {
        Parcel parcel = new Parcel();
        parcel.setTrackingId(dto.getTrackingId());
        parcel.setSenderName(dto.getSenderName());
        parcel.setReceiverName(dto.getReceiverName());
        parcel.setOriginAddress(dto.getOriginAddress());
        parcel.setDestinationAddress(dto.getDestinationAddress());
        parcel.setStatus(Status.PENDING); // default status
        parcel.setCreatedAt(LocalDateTime.now()); // current time
        return parcelRepo.save(parcel);
    }
}
