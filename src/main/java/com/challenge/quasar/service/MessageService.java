package com.challenge.quasar.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {
    public String getMessage(String[][] messages) {
        int maxLength = Arrays.stream(messages)
                .mapToInt(arr -> arr.length)
                .max()
                .orElse(0);

        String[] reconstructedMessage = new String[maxLength];

        for (String[] messageParts : messages) {
            for (int i = 0; i < messageParts.length; i++) {
                if (messageParts[i] != null && !messageParts[i].isEmpty()) {
                    reconstructedMessage[i] = messageParts[i];
                }
            }
        }

        return String.join(" ", reconstructedMessage).trim();
    }
}