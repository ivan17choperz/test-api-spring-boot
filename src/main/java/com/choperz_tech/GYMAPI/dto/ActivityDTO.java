package com.choperz_tech.GYMAPI.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ActivityDTO {
    private String name_professional;
    private String name_activity;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_execution;
}
