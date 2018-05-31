package com.alevel.mitin.WeatherApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

import java.util.List;

import static com.alevel.mitin.WeatherApp.Temperature.isValid;

public class WeatherLog {

    private final static String FILENAME = "Weather_Log.txt";

    private WeatherLog() {
    }

    public static WeatherLog instance() {
        return new WeatherLog();
    }

    public void addReport(String temper) throws TemperatureFormatException {
        if (isValid(temper)) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
                writer.write(temper);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new TemperatureFormatException("Not valid temperature format");
        }
    }

    public List<String> getReport() {

        try {
            return Files.readAllLines(Paths.get(FILENAME));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
