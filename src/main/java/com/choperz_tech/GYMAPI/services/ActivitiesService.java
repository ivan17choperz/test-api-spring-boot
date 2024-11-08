package com.choperz_tech.GYMAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choperz_tech.GYMAPI.dto.ActivityDTO;
import com.choperz_tech.GYMAPI.models.Activity;
import com.choperz_tech.GYMAPI.repositories.ActivityRepository;

@Service
public class ActivitiesService {
    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getActivities() {
        return activityRepository.findAll();
    }

    public Activity saveActivity(ActivityDTO activity) {
        Activity newActivity = new Activity();
        newActivity.setName_professional(activity.getName_professional());
        newActivity.setName_activity(activity.getName_activity());
        newActivity.setDate_execution(activity.getDate_execution());

        return activityRepository.save(newActivity);
    }

    public String deleteActivity(Long id) {
        activityRepository.deleteById(id);
        return "Activity was deleted";
    }

}
