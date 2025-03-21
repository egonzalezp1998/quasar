package com.challenge.quasar.utils;

import com.challenge.quasar.dto.TopSecretSplitRequestDTO;
import com.challenge.quasar.dto.TopsSecretRequestDTO;
import com.challenge.quasar.model.TopSecretSatellite;

public class TopSecretSatelliteMapper {
    public static TopSecretSatellite mapTo(TopsSecretRequestDTO topsSecretRequestDTO) {
        return TopSecretSatellite.builder()
                .satellites(SatelliteMapper.mapListTo(topsSecretRequestDTO.getSatellites()))
                .build();
    }
}
