package JavaII;

/**
 * Created by roxana on 5/17/17.
 */
public class Circle {
    private double radius;
    private static int circleNumber;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void setCircleNumber(int number) {
        circleNumber = number;
    }

    public static int getCircleNumber() {
        return circleNumber;
    }
}
