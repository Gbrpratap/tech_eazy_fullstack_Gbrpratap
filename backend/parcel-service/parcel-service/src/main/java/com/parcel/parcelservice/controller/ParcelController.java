package com.parcel.parcelservice.controller;

import com.parcel.parcelservice.dto.ParcelDTO;
import com.parcel.parcelservice.entity.Parcel;
import com.parcel.parcelservice.service.ParcelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost") // Allow React frontend (port 80)
@RestController
@RequestMapping("/api/parcels")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    // GET all parcels
    @GetMapping
    public List<Parcel> getAllParcels() {
        return parcelService.getAllParcels();
    }

    // GET parcel by tracking ID
    @GetMapping("/{trackingId}")
    public Optional<Parcel> getParcelByTrackingId(@PathVariable String trackingId) {
        return parcelService.getParcelByTrackingId(trackingId);
    }

    // POST create a new parcel
    @PostMapping
    public Parcel createParcel(@RequestBody ParcelDTO parcelDTO) {
        return parcelService.createParcel(parcelDTO);
    }
}
