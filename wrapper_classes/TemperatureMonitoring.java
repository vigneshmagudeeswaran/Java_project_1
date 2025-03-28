public class TemperatureMonitoring {
    // Storing temperature readings using Double wrapper class
    private Double currentTemperature;

    // Method to set current temperature
    public void setCurrentTemperature(double temperature) {
        currentTemperature = temperature;
    }

    // Method to convert temperature from Celsius to Fahrenheit
    public double convertToCelsius() {
        return (currentTemperature - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        TemperatureMonitoring temperatureMonitoring = new TemperatureMonitoring();
        temperatureMonitoring.setCurrentTemperature(98.6);

        double currentCelsiusTemperature = temperatureMonitoring.convertToCelsius();
        System.out.println("Current Temperature (Celsius): " + currentCelsiusTemperature);
    }
}

