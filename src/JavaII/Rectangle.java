package JavaII;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by roxana on 5/19/17.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2*this.width + 2*this.length;
    }
}

class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getPerimeter() {
        return 4*this.side;
    }

    public double getArea() {
        return this.side * this.side;
    }
}

class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);

        System.out.println("Area for box1 is: " + box1.getArea());
        System.out.println("Perimeter for box1 is: " + box1.getPerimeter());

        System.out.println("Area for box2 is: " + box2.getArea());
        System.out.println("Perimeter for box2 is: " + box2.getPerimeter());
    }

}
