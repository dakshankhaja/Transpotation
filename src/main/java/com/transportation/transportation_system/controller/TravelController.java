package com.transportation.transportation_system.controller;

import com.transportation.transportation_system.model.TravelRecord;
import com.transportation.transportation_system.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/travel")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping("/form")
    public String showTravelForm(Model model) {
        model.addAttribute("travelRecord", new TravelRecord());
        return "travel-form";
    }

    @PostMapping("/save")
    public String saveTravelRecord(@ModelAttribute TravelRecord travelRecord) {
        travelService.saveTravelRecord(travelRecord);
        return "redirect:/travel/form";
    }
}

