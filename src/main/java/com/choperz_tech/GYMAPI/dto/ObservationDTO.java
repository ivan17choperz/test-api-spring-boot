package com.choperz_tech.GYMAPI.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ObservationDTO {
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
