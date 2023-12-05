package com.github.gluhov.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private static final Map<String, Airport> airports = new HashMap<>();

    public Airport getAirportByCode(String code) {
        Airport airport = airports.get(code);

        if (!airports.containsKey(code)) {
            switch (code) {
                case "LED" -> {
                    System.out.println("Add new international airport with code " + code);
                    airport = new InternationalAirport();
                }
                case "VGD" -> {
                    System.out.println("Add new local airport with code " + code);
                    airport = new LocalAirport();
                }
            }
            airports.put(code, airport);
        }
        return airport;
    }
}
