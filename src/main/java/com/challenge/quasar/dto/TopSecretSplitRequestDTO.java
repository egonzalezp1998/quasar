package com.challenge.quasar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopSecretSplitRequestDTO {

    @NotNull(message = "El campo no puede ser null")
    @NotBlank(message = "El campo no puede ser vacio")
    private double distance;
    @NotEmpty(message = "El mensaje no puede estar vacio o null")
    private List<String> message;
}
