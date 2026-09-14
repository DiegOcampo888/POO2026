public class Product {
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean setProductName(String newProductName) {
        if (newProductName == null || newProductName.isEmpty()) {
            return false;
        }
        this.productName = newProductName;
        return true;
    }

    public boolean setPrice(double newPrice) {
        if (newPrice <= 0) {
            return false;
        }
        this.price = newPrice;
        return true;
    }

    public boolean setStock(int newStock) {
        if (newStock < 0) {
            return false;
        }
        this.stock = newStock;
        return true;
    }
}