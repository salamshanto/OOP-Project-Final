public class Main {
    public static void main(String[] args) {
        
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        
        WeatherObserver weatherDisplay = new WeatherDisplay();
        WeatherObserver hvacController = new HVACController();

        
        temperatureSensor.addObserver(weatherDisplay);
        temperatureSensor.addObserver(hvacController);

        
        temperatureSensor.setTemperature(20.5);
        temperatureSensor.setTemperature(15.5);
        temperatureSensor.setTemperature(30.5);
    }
}