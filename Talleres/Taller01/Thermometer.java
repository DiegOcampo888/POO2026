public class Thermometer {
    private static final double MIN_TEMPERATURE = -50.0;
    private static final double MAX_TEMPERATURE = 100.0;

    private double currentTemperature;

    public Thermometer() {
        this.currentTemperature = 0.0;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean setCurrentTemperature(double newTemperature) {
        if (newTemperature < MIN_TEMPERATURE || newTemperature > MAX_TEMPERATURE) {
            return false;
        }
        this.currentTemperature = newTemperature;
        return true;
    }
}