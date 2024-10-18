package Jobsheet03;

public class MotorDemo {

    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

        // Test exceeding the speed limit
        motor3.setKecepatan(120);  // should not allow setting this value
        motor3.displayStatus();

        // Test setting negative speed
        motor2.setKecepatan(-10);  // should not allow setting negative speed
        motor2.displayStatus();
    }
}
