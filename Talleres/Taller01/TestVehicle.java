public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Mazda", 120);

        System.out.println("Marca: " + car.getBrand() + ", velocidad máxima: " + car.getMaximumSpeed() + ", velocidad actual: " + car.getCurrentSpeed());

        Vehicle.PlateUpdateResult plateResult1 = car.setLicensePlate("abc123");
        System.out.println("Placa 'abc123': " + plateResult1 + ". Placa almacenada: " + car.getLicensePlate());

        Vehicle.PlateUpdateResult plateResult2 = car.setLicensePlate("XYZ789");
        System.out.println("Placa 'XYZ789': " + plateResult2 + ". Placa almacenada: " + car.getLicensePlate());

        Vehicle.PlateUpdateResult plateResult3 = car.setLicensePlate("12AB34");
        System.out.println("Placa '12AB34': " + plateResult3 + ". Placa almacenada: " + car.getLicensePlate());

        boolean decreaseWhileStopped = car.decreaseSpeed();
        System.out.println("Disminuir velocidad estando detenido: " + (decreaseWhileStopped ? "aceptado" : "rechazado") + ". Velocidad: " + car.getCurrentSpeed());

        for (int i = 0; i < 13; i++) {
            boolean increased = car.increaseSpeed();
            System.out.println("Intento de aumentar velocidad: " + (increased ? "aceptado" : "rechazado") + ". Velocidad: " + car.getCurrentSpeed());
        }
    }
}