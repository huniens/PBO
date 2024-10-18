public class SmartWatch {
    private String brand;
    private int batteryLevel;
    private int heartRate;

    // Constructor
    public SmartWatch(String brand, int batteryLevel, int heartRate) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.heartRate = heartRate;
    }

    // Method to reduce battery level
    public void reduceBattery(int amount) {
        batteryLevel = Math.max(0, batteryLevel - amount); // Ensure battery doesn't go below 0
    }

    // Method to measure heart rate
    public void measureHeartRate(int newHeartRate) {
        this.heartRate = newHeartRate; // Update the heart rate
    }

    // Method to display smartwatch information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println();
    }
}
    