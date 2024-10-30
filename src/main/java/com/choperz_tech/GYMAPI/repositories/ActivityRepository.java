package com.choperz_tech.GYMAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.choperz_tech.GYMAPI.models.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
