package com.choperz_tech.GYMAPI.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Observations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Client client;

    private LocalDate date;
    private Double weight;
    private Double size;
    private String details;

}
