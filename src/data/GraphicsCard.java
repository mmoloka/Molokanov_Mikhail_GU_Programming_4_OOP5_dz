package data;

public class GraphicsCard {

    private String brand;

    private String model;

    public GraphicsCard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
