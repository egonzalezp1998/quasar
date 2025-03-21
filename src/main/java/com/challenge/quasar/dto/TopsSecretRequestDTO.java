package com.challenge.quasar.dto;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopsSecretRequestDTO {
    @NotEmpty(message = "La lista de satélites no puede estar vacía")
    @NotNull(message = "La lista no puede ser null")
    @NotBlank(message = "La lista no puede estar en blanco")
    @Valid
    private List<SatelliteDTO> satellites;
}
