package com.challenge.quasar.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor

public class InsertLocationResponseDTO {
    @NotNull(message = "prueba")
    private PositionDTO position;
    @NotNull(message = "prueba")
    private String message;
}
