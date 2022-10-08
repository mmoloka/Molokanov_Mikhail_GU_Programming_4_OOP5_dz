package data;

public class SSD {

    private String brand;

    private String memory;

    public SSD(String brand, String memory) {
        this.brand = brand;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return brand + " " + memory;
    }
}
