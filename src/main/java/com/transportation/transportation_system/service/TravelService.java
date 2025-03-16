package com.transportation.transportation_system.service;

import com.transportation.transportation_system.model.TravelRecord;
import com.transportation.transportation_system.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;

    public void saveTravelRecord(TravelRecord record) {
        travelRepository.save(record);
    }

    public List<TravelRecord> getRecordsByUser(String username) {
        return travelRepository.findByUsername(username);
    }
}
