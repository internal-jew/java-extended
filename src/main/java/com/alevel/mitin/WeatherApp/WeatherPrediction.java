package com.alevel.mitin.WeatherApp;

import java.util.List;

public class WeatherPrediction {
    private final List<String> reports;

    private WeatherPrediction(List<String> reports) {
        this.reports = reports;
    }

    public static WeatherPrediction basedOn(WeatherLog weatherLog) {
        //получить все записи погоды

        List<String> listReports = weatherLog.getReport();
        return new WeatherPrediction(listReports);
    }

    public String getValue() {
        return reports.get(reports.size() - 1);
    }


}
