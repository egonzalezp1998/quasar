package com.challenge.quasar.service;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class LocationService {

    public Point getLocation(double[] distances) {

        Point kenobi = new Point(-500, -200);
        Point skyWalker = new Point(100, -100);
        Point sato = new Point(500, 100);

        double distance1 = distances[0];
        double distance2 = distances[1];
        double distance3 = distances[2];

        double A = 2 * (skyWalker.getX() - kenobi.getX());
        double B = 2 * (skyWalker.y - kenobi.y);
        double C = Math.pow(distance1, 2) - Math.pow(distance2, 2) - Math.pow(kenobi.x, 2) + Math.pow(skyWalker.x, 2) - Math.pow(kenobi.y, 2) + Math.pow(skyWalker.y, 2);

        double D = 2 * (sato.x - kenobi.x);
        double E = 2 * (sato.y - kenobi.y);
        double F = Math.pow(distance1, 2) - Math.pow(distance3, 2) - Math.pow(kenobi.x, 2) + Math.pow(sato.x, 2) - Math.pow(kenobi.y, 2) + Math.pow(sato.y, 2);

        double x = (C * E - F * B) / (E * A - B * D);
        double y = (C * D - A * F) / (B * D - A * E);

        return new Point((int) Math.round(x), (int) Math.round(y));
    }
}

