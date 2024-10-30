package com.choperz_tech.GYMAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choperz_tech.GYMAPI.models.Observations;
import com.choperz_tech.GYMAPI.repositories.ObservationRepository;

@Service
public class ObservationService {
    @Autowired
    private ObservationRepository observationRepository;

    // public List<Observations> getObservationRepository(Long id) {

    //     List<Observations> observations = observationRepository.findByClient(id);

    //     return observations;

    // }

}
