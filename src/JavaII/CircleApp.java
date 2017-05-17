package JavaII;

/**
 * Created by roxana on 5/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Circle circle;
        Input input = new Input();

        do {
            System.out.println("Enter radius:");
            circle = new Circle(input.getDouble());
            System.out.println("Area = " + circle.getArea());
            System.out.println("Circumference = " + circle.getCircumference());
        } while(input.yesNo());

        System.out.println("Total number of circles is: " + Circle.getCircleNumber());
    }
}
