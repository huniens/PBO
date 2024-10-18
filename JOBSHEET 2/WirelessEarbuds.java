public class WirelessEarbuds {
    public String brand;
    public String batteryLife;
    public String connectivity;
    public int volume;

    public WirelessEarbuds(String brand, String batteryLife, String connectivity, int volume) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.connectivity = connectivity;
        this.volume = volume;
    }

    public void playPauseMusic() {
        System.out.println("Music is playing or paused.");
    }

    public void answerEndCalls() {
        System.out.println("Call answered or ended.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Volume: " + volume);
    }
}
