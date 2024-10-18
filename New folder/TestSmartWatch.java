import java.util.ArrayList;
import java.util.List;

public class TestSmartWatch {
    public static void main(String[] args) {
        // Create a list of smartwatches
        List<SmartWatch> smartWatches = new ArrayList<>();
        smartWatches.add(new SmartWatch("Apple Watch", 80, 75));
        smartWatches.add(new SmartWatch("Samsung Galaxy Watch", 60, 85));
        smartWatches.add(new SmartWatch("Fitbit", 100, 60));
        smartWatches.add(new SmartWatch("Garmin", 85, 50));
        smartWatches.add(new SmartWatch("Huawei Watch", 90, 40));
        smartWatches.add(new SmartWatch("Fossil", 50, 85));
        smartWatches.add(new SmartWatch("Amazfit", 75, 80));
        smartWatches.add(new SmartWatch("Suunto", 60, 80));
        smartWatches.add(new SmartWatch("Tic Watch", 90, 70));
        smartWatches.add(new SmartWatch("Withings", 70, 85));

        // Update battery and heart rate, then display info
        for (SmartWatch watch : smartWatches) {
            watch.reduceBattery(10);   // Simulate battery usage
            watch.measureHeartRate(5); // Simulate heart rate measurement
            watch.displayInfo();       // Display updated info
        }
    }
}
