package com.challenge.quasar.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Satellite {
    @NotNull(message = "prueba")
    private String name;
    private double distance;
    private String[] message;
}

