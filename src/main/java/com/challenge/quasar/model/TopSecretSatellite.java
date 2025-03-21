package com.challenge.quasar.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopSecretSatellite {
    private List<Satellite> satellites;
}
