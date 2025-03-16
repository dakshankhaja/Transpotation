package com.transportation.transportation_system.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class TravelRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private LocalDate travelDate;
    private double distance;
    private String destination;

    public TravelRecord() {}

    public TravelRecord(String username, LocalDate travelDate, double distance, String destination) {
        this.username = username;
        this.travelDate = travelDate;
        this.distance = distance;
        this.destination = destination;
    }

    // Getters and Setters
}
