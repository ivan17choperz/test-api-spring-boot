package com.choperz_tech.GYMAPI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choperz_tech.GYMAPI.dto.ObservationDTO;
import com.choperz_tech.GYMAPI.models.Observations;
import com.choperz_tech.GYMAPI.services.ObservationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private final ObservationService observationService;

    public ProgressController(ObservationService observationService) {
        this.observationService = observationService;
    }

    @GetMapping("/{id}")
    public List<Observations> getProgressUser(@PathVariable Long id) {
        return observationService.getObservationRepository(id);
    }

    public Observations setObservations(@RequestBody ObservationDTO observationDTO) {

        return observationService.saveObservation(observationDTO);
    }

}
