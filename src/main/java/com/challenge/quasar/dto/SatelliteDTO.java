package com.challenge.quasar.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SatelliteDTO {
    @NotNull(message = "El nombre del satélite no puede ser nulo")
    private String name;

    @NotNull(message = "La distancia no puede ser nula")
    private Double distance;

    @NotEmpty(message = "El mensaje no puede estar vacío")
    private String[] message;
}
