public class WirelessEarbudsDemo {
    public static void main(String[] args) {
        WirelessEarbuds earbuds1 = new WirelessEarbuds("Sony", "12 hours", "Bluetooth 5.0", 50);
        WirelessEarbuds earbuds2 = new WirelessEarbuds("Samsung", "10 hours", "Bluetooth 4.2", 30);

        System.out.println("Earbuds 1 Info:");
        earbuds1.displayInfo();
        System.out.println();

        System.out.println("Earbuds 2 Info:");
        earbuds2.displayInfo();
        System.out.println();

        earbuds1.volume = 70;
        earbuds2.brand = "Apple";

        earbuds1.playPauseMusic();

        System.out.println("\nUpdated Earbuds 1 Info:");
        earbuds1.displayInfo();

        System.out.println("\nUpdated Earbuds 2 Info:");
        earbuds2.displayInfo();
    }
}
