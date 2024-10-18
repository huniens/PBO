public class bycicle
{
    public static void main(String[] args) {
        String merk, merk2;
        int speed, speed2,gear, gear2;

        merk ="Polygon";
        speed = 10;
        gear = 1;

        merk2 = "Wiim Cycle";
        speed2 = 15;
        gear2 = 3;

        speed = increaseSpeed(speed,10);
        speed2 = reduceSpeed(speed2, 5);

        System.out.println("merk = " + merk);
        System.out.println("speed = " + speed);

        System.out.println("merk = " + merk2);
        System.out.println("speed = " + speed2);

    }

    public static int increaseSpeed(int speed, int increment)
    {
        speed += increment;
        return speed;
    }
    public static int reduceSpeed(int speed, int decrement)
    {
        speed -= decrement;
        return speed;
    }
}