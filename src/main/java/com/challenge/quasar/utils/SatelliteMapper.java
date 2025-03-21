package com.challenge.quasar.utils;

import com.challenge.quasar.dto.SatelliteDTO;
import com.challenge.quasar.model.Satellite;

import java.util.List;

public class SatelliteMapper {

    public static List<Satellite> mapListTo(List<SatelliteDTO> satellitesDTO) {
        return satellitesDTO.stream().map(SatelliteMapper::mapTo).toList();
    }

    public static Satellite mapTo(SatelliteDTO satelliteDTO) {
        return Satellite.builder()
                .name(satelliteDTO.getName())
                .message(satelliteDTO.getMessage())
                .distance(satelliteDTO.getDistance())
                .build();
    }

}
