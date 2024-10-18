/**
 * Rectangle
 */
public class Rectangle {

    public double length;
    public double wide;

    public double getArea() {
        return length * wide;
    }

    public double getCircumference() {
        return 2 * (length + wide);
    }

    public void displayInfo() {
        System.out.println("Length                          : " + length);
        System.out.println("Wide                            : " + wide);
        System.out.println("Rectangular area                : " + getArea());
        System.out.println("Circumference Of Arectangle     : " + getCircumference());
    }

}