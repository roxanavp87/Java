package JavaII;

/**
 * Created by roxana on 5/19/17.
 */
abstract class Shape {

}


abstract class Quadralateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract public void setLength(double length);

    abstract public void setWidth(double width);
}
