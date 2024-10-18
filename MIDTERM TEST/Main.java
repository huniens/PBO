public class Main {
    public static void main(String[] args) {
        // Create a Smartphone object
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S21", 75, 128);

        // Using methods from ElectronicDevice, Mobile, and Smartphone
        myPhone.powerOn();
        myPhone.showInfo();
        myPhone.checkBattery();
        myPhone.call("John Doe");
        myPhone.chargeBattery(20);
        myPhone.checkBattery();
        myPhone.connectToWiFi();
        myPhone.browseInternet();
        myPhone.checkStorage();
        myPhone.powerOff();
    }
}
