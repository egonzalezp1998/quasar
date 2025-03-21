package com.challenge.quasar.controller;

import com.challenge.quasar.dto.InsertLocationResponseDTO;
import com.challenge.quasar.dto.SplitLocationResponseDTO;
import com.challenge.quasar.dto.TopSecretSplitRequestDTO;
import com.challenge.quasar.dto.TopsSecretRequestDTO;
import com.challenge.quasar.service.ITopSecretService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopSecretController {

    private final ITopSecretService topSecretService;

    public TopSecretController(ITopSecretService topSecretService) {
        this.topSecretService = topSecretService;
    }

    @PostMapping("/topsecret")
    public ResponseEntity<?> postDataSatellite(@Valid @RequestBody TopsSecretRequestDTO topsSecretRequestDTO) {
        InsertLocationResponseDTO response = topSecretService.insertLocation(topsSecretRequestDTO);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/topsecret/split/{name}")
    public ResponseEntity<?> postDataSalliteSplit(@Valid @RequestBody TopSecretSplitRequestDTO topSecretSplitRequestDTO,
                                                  @PathVariable String name) {
        SplitLocationResponseDTO response = topSecretService.postSplitLocation(topSecretSplitRequestDTO, name);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/topsecret/split/{name}")
    public ResponseEntity<?> getDataSalliteSplit(@PathVariable String name) {
        //return new ResponseEntity<>(topSecretService.getSplitLocation(name), HttpStatus.OK);
        return ResponseEntity.ok(topSecretService.getSplitLocation(name));
    }
}
