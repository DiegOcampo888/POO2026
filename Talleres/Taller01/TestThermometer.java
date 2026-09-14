public class TestThermometer {
    public static void main(String[] args) {
        Thermometer digitalThermometer = new Thermometer();

        double[] temperaturesToTest = {25.0, -60.0, 99.5, 150.0, -50.0};

        for (double temperatureAttempt : temperaturesToTest) {
            boolean wasAccepted = digitalThermometer.setCurrentTemperature(temperatureAttempt);

            if (wasAccepted) {
                System.out.println("Temperatura " + temperatureAttempt + "°C aceptada. Valor actual: " + digitalThermometer.getCurrentTemperature() + "°C");
            } else {
                System.out.println("Temperatura " + temperatureAttempt + "°C rechazada (fuera de rango). Valor actual: " + digitalThermometer.getCurrentTemperature() + "°C");
            }
        }
    }
}