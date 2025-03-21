package com.challenge.quasar.service;

import com.challenge.quasar.dto.InsertLocationResponseDTO;
import com.challenge.quasar.dto.SplitLocationResponseDTO;
import com.challenge.quasar.dto.TopSecretSplitRequestDTO;
import com.challenge.quasar.dto.TopsSecretRequestDTO;

public interface ITopSecretService {
    public InsertLocationResponseDTO insertLocation(TopsSecretRequestDTO topsSecretRequestDTO);
    public SplitLocationResponseDTO  postSplitLocation(TopSecretSplitRequestDTO topSecretSplitRequestDTO, String name);
    public SplitLocationResponseDTO getSplitLocation(String name);
}

