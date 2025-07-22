package com.parcel.parcelservice.repo;

import com.parcel.parcelservice.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParcelRepo extends JpaRepository<Parcel, Long> {
    Optional<Parcel> findByTrackingId(String trackingId);
}
