package be.intecbrussel.exercisesinheritance;

public class Circle extends Shape {

    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    {
        count++;
    }

    public Circle() {
    }

    public Circle(int radius) {
        setRadius(radius);
    }

    public Circle(int radius, int x, int y) {
        this(radius);
        setPosition(x, y);
    }

    public Circle(Circle c) {
        this(c.radius);
        setPosition(c.getX(), c.getY());
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius < 0 ? -radius : radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    public void grow(int d){
        radius=radius+=d<0? -d:d;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getRadius();
        return result;
    }
}
