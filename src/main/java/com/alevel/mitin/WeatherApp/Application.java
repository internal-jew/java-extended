package com.alevel.mitin.WeatherApp;

public class Application {

    public static final String LOG = "--log";
    public static final String PREDICT = "--predict";

    private Application() {
    }

    public static Application instance() {
        return new Application();
    }

    public void run(String[] args) {

        for (int i = 0; i < args.length; i++) {
//            System.out.println("i " + i + "; arg = \"" + args[i]+"\"");
            String mode = args[i];

            WeatherLog weatherLog = WeatherLog.instance();
            if (mode.equalsIgnoreCase(LOG)) {
                String temper = args[i + 1];
//                System.out.println("temperature = \""+temper+"\"");
                try {
                    weatherLog.addReport(temper);
                } catch (TemperatureFormatException e) {
                    System.out.println("invalid format");
                    System.exit(1);
                }
            } else if (mode.equalsIgnoreCase(PREDICT)) {
                WeatherPrediction prediction = WeatherPrediction.basedOn(weatherLog);
                System.out.println(prediction.getValue());
            }
        }
    }
}
