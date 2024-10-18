public class ElectronicDevice {
    // Attributes
    private String brand;
    private String model;

    // Constructor
    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Methods
    public void powerOn() {
        System.out.println(brand + " " + model + " is now ON.");
    }

    public void powerOff() {
        System.out.println(brand + " " + model + " is now OFF.");
    }

    public void showInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
