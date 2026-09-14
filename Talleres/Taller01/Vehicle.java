public class Vehicle {
    public enum PlateUpdateResult {
        ACCEPTED_NO_CHANGE,
        ACCEPTED_NORMALIZED,
        REJECTED
    }

    private String licensePlate;
    private final String brand;
    private int currentSpeed;
    private final int maximumSpeed;

    public Vehicle(String brand, int maximumSpeed) {
        this.brand = brand;
        this.maximumSpeed = maximumSpeed;
        this.currentSpeed = 0;
        this.licensePlate = "";
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public PlateUpdateResult setLicensePlate(String newPlate) {
        if (newPlate == null || !newPlate.matches("[a-zA-Z]{3}[0-9]{3}")) {
            return PlateUpdateResult.REJECTED;
        }

        String normalizedPlate = newPlate.toUpperCase();

        if (normalizedPlate.equals(newPlate)) {
            this.licensePlate = normalizedPlate;
            return PlateUpdateResult.ACCEPTED_NO_CHANGE;
        } else {
            this.licensePlate = normalizedPlate;
            return PlateUpdateResult.ACCEPTED_NORMALIZED;
        }
    }

    public boolean increaseSpeed() {
        if (currentSpeed + 10 > maximumSpeed) {
            return false;
        }
        currentSpeed += 10;
        return true;
    }

    public boolean decreaseSpeed() {
        if (currentSpeed - 10 < 0) {
            return false;
        }
        currentSpeed -= 10;
        return true;
    }
}