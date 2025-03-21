package com.challenge.quasar.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionDTO {
    @NotNull(message = "prueba")
    private double x;
    @NotNull(message = "prueba")
    private double y;
}
