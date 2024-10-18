public class Smartphone extends Mobile {
    // Attributes specific to Smartphone
    private int storageCapacity;
    private boolean isConnectedToWiFi;

    // Constructor
    public Smartphone(String brand, String model, int batteryLevel, int storageCapacity) {
        super(brand, model, batteryLevel);
        this.storageCapacity = storageCapacity;
        this.isConnectedToWiFi = false; // initially not connected to WiFi
    }

    // Methods
    public void connectToWiFi() {
        isConnectedToWiFi = true;
        System.out.println("Connected to WiFi.");
    }

    public void disconnectFromWiFi() {
        isConnectedToWiFi = false;
        System.out.println("Disconnected from WiFi.");
    }

    public void checkStorage() {
        System.out.println("Storage capacity: " + storageCapacity + "GB.");
    }

    public void browseInternet() {
        if (isConnectedToWiFi) {
            System.out.println("Browsing the internet...");
        } else {
            System.out.println("Please connect to WiFi to browse the internet.");
        }
    }

    // Getters and setters
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean isConnectedToWiFi() {
        return isConnectedToWiFi;
    }

    public void setConnectedToWiFi(boolean connectedToWiFi) {
        isConnectedToWiFi = connectedToWiFi;
    }
}
