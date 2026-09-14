public class TestProduct {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1500000.0, 10);

        System.out.println("Producto inicial: " + laptop.getProductName() + ", $" + laptop.getPrice() + ", stock: " + laptop.getStock());

        boolean nameResult = laptop.setProductName("");
        System.out.println("Intento de cambiar nombre a vacío: " + (nameResult ? "aceptado" : "rechazado"));

        boolean priceResult = laptop.setPrice(-100.0);
        System.out.println("Intento de cambiar precio a -100: " + (priceResult ? "aceptado" : "rechazado"));

        boolean stockResult = laptop.setStock(-5);
        System.out.println("Intento de cambiar stock a -5: " + (stockResult ? "aceptado" : "rechazado"));

        boolean validPriceResult = laptop.setPrice(1400000.0);
        System.out.println("Intento de cambiar precio a 1400000: " + (validPriceResult ? "aceptado" : "rechazado"));

        boolean validStockResult = laptop.setStock(25);
        System.out.println("Intento de cambiar stock a 25: " + (validStockResult ? "aceptado" : "rechazado"));

        System.out.println("Producto final: " + laptop.getProductName() + ", $" + laptop.getPrice() + ", stock: " + laptop.getStock());
    }
}