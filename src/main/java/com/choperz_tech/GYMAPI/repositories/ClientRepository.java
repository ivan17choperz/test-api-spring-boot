package com.choperz_tech.GYMAPI.repositories;

import com.choperz_tech.GYMAPI.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}