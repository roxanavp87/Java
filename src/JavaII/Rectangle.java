package JavaII;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by roxana on 5/19/17.
 */
public class Rectangle extends Quadralateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2*this.getLength() + 2*this.getWidth();
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}

class Square extends Quadralateral {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


}

class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5,4);

        System.out.println("Area for box1 is: " + myShape.getArea());
        System.out.println("Perimeter for box1 is: " + myShape.getPerimeter());

        myShape = new Square(5);

        System.out.println("Area for box2 is: " + myShape.getArea());
        System.out.println("Perimeter for box2 is: " + myShape.getPerimeter());
    }

}
