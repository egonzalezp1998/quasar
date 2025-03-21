package com.challenge.quasar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class SplitLocationResponseDTO {
    private double distance;
    private String[] message;

}
