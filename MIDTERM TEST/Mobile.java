public class Mobile extends ElectronicDevice {
    // Attribute specific to Mobile
    private int batteryLevel;

    // Constructor
    public Mobile(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }

    // Methods
    public void checkBattery() {
        System.out.println("Battery level is " + batteryLevel + "%.");
    }

    public void call(String contact) {
        System.out.println("Calling " + contact + "...");
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Battery charged. Current level: " + batteryLevel + "%.");
    }

    // Getters and setters
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
