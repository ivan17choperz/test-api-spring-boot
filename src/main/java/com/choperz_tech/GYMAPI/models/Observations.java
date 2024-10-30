package com.choperz_tech.GYMAPI.models;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Observations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private LocalDate date;
    private Double weight;                // Peso
    private Double size;                  // Talla
    private Double height;                // Altura
    private Double maxBenchPress;         // Peso en press de banca
    private Double maxSquat;              // Peso en sentadilla
    private Integer cardioEndurance;      // Ejemplo: distancia o tiempo en carrera (según unidades)
    private Double caloriesBurned;        // Calorías quemadas (si se tiene esta info)
    private String personalGoals;         // Metas personales (por ejemplo: "aumentar fuerza")
    private String additionalDetails;     // Detalles adicionales si es necesario

}
