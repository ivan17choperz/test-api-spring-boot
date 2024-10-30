package com.choperz_tech.GYMAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choperz_tech.GYMAPI.dto.ActivityDTO;
import com.choperz_tech.GYMAPI.models.Activity;
import com.choperz_tech.GYMAPI.services.ActivitiesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ActivitiesController {

    @Autowired
    private ActivitiesService activitiesService;

    @GetMapping("/activities")
    public List<Activity> activities() {
        return activitiesService.getActivities();
    }

    @PostMapping("/save-activity")
    public ResponseEntity<Activity> saveAtivities(@RequestBody ActivityDTO activity) {
        Activity savedActivity = activitiesService.saveActivity(activity);
        return ResponseEntity.ok(savedActivity);
    }
}
