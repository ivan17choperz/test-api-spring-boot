package com.choperz_tech.GYMAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choperz_tech.GYMAPI.models.Observations;

public interface ObservationRepository extends JpaRepository<Observations, Long> {
    List<Observations> findByClient(Long clientId);
}
