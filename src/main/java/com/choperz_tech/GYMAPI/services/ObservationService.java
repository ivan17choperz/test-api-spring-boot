package com.choperz_tech.GYMAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choperz_tech.GYMAPI.dto.ObservationDTO;
import com.choperz_tech.GYMAPI.models.Client;
import com.choperz_tech.GYMAPI.models.Observations;
import com.choperz_tech.GYMAPI.repositories.ObservationRepository;

@Service
public class ObservationService {
    @Autowired
    private ObservationRepository observationRepository;

    @Autowired
    private ClientService clientService;

    public List<Observations> getObservationRepository(Long id) {

        List<Observations> observations = observationRepository.findByClient_Id(id);

        return observations;

    }

    public Observations saveObservation(ObservationDTO observation) {

        Observations observationEntity = new Observations();
        Client client = clientService.getClientById(observation.getClientId());

        observationEntity.setClient(client);
        observationEntity.setDate(observation.getDate());
        observationEntity.setWeight(observation.getWeight());
        observationEntity.setHeight(observation.getHeight());
        observationEntity.setSize(observation.getSize());
        observationEntity.setMaxBenchPress(observation.getMaxBenchPress());
        observationEntity.setMaxSquat(observation.getMaxSquat());
        observationEntity.setCardioEndurance(observation.getCardioEndurance());
        observationEntity.setCaloriesBurned(observation.getCaloriesBurned());
        observationEntity.setPersonalGoals(observation.getPersonalGoals());
        observationEntity.setAdditionalDetails(observation.getAdditionalDetails());

        return observationRepository.save(observationEntity);
    }

}
