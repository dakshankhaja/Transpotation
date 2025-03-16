package com.transportation.transportation_system.repository;


import com.transportation.transportation_system.model.TravelRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TravelRepository extends JpaRepository<TravelRecord, Long> {
    List<TravelRecord> findByUsername(String username);
}
