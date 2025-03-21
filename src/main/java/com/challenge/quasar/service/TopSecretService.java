package com.challenge.quasar.service;

import com.challenge.quasar.dto.*;
import com.challenge.quasar.exception.NotFoundException;
import com.challenge.quasar.model.Satellite;
import com.challenge.quasar.utils.SatelliteMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Orquesta los otros 2 service y es usado por el controlador
@Service
public class TopSecretService implements ITopSecretService {
    private final LocationService locationService;
    private final MessageService messageService;
    private final List<Satellite> satellites = new ArrayList<>();

    public TopSecretService(LocationService locationService, MessageService messageService) {
        this.locationService = locationService;
        this.messageService = messageService;
    }

    @Override
    public InsertLocationResponseDTO insertLocation(TopsSecretRequestDTO topsSecretRequestDTO) {
        List<SatelliteDTO> satellitesDTOs = topsSecretRequestDTO.getSatellites();
        satellites.addAll(SatelliteMapper.mapListTo(satellitesDTOs));

        double[] distances = satellitesDTOs.stream()
                .mapToDouble(SatelliteDTO::getDistance)
                .toArray();

        String[][] messages = satellitesDTOs.stream()
                .map(SatelliteDTO::getMessage)
                .toArray(String[][]::new);

        Point position = locationService.getLocation(distances);
        PositionDTO positionDTO = new PositionDTO(position.getX(), position.getY());
        String message = messageService.getMessage(messages);

        System.out.println("prueba");
        return new InsertLocationResponseDTO(positionDTO, message);

    }

    @Override
    public SplitLocationResponseDTO postSplitLocation(TopSecretSplitRequestDTO topSecretSplitRequestDTO, String name) {
        Optional<Satellite> existingSatellite = satellites.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .peek(s -> System.out.println("Encontrado satélite: " + s.getName()))
                .findFirst();

        if (existingSatellite.isPresent()) {
            existingSatellite.get().getMessage();

            return null;
        } else {
            return null;
        }
    }

    @Override
    public SplitLocationResponseDTO getSplitLocation(String name) {
        Optional<Satellite> satellite = satellites.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
        if (satellite.isEmpty()) {
            throw new NotFoundException("No hay hay suficiente información");
        }
        return SplitLocationResponseDTO.builder()
                .message(satellite.get().getMessage())
                .distance(satellite.get().getDistance())
                .build();
    }
}
