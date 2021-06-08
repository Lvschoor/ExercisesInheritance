package be.intecbrussel.exercisesinheritance;

public class Rectangle extends Shape {


    private int height;
    private int width;
    public static final int ANGLES = 4;
    private static int count;

    {
        count++;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(int width, int height, int x, int y) {
        this(width, height);
        setPosition(x, y);
    }

    public Rectangle(Rectangle r) {
        setHeight(r.height);
        setWidth(r.width);
        setX(r.getX());
        setY(r.getY());
    }

    public void setHeight(int height) {
        //check if height is positive, else change sign
        this.height = height < 0 ? -height : height;
    }

    public void setWidth(int width) {
        //check if width is positive, else change sign
        this.width = width < 0 ? -width : width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
    public void grow(int d) {
        //check if d is a positive value, if negative, change sign
        width += d < 0 ? -d : d;
        height += d < 0 ? -d : d;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getHeight() != rectangle.getHeight()) return false;
        return getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        return result;
    }
}
