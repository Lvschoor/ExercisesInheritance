package be.intecbrussel.exercisesinheritance;

public class Triangle extends Shape{

    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(){

    }

    public Triangle(int w, int h, int p){
        setWidth(w);
        setHeight(h);
        setPerpendicular(p);
    }
    public Triangle(int w, int h, int p, int x, int y){
        this(w,h,p);
        setPosition(x,y);
    }

    public Triangle(Triangle t){
        this(t.width,t.height, t.perpendicular, t.getX(), t.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int p) {
        this.perpendicular = p;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return (width*height)/2;
    }

    @Override
    public double getPerimeter() {
    double a = Math.sqrt(Math.pow(perpendicular,2)+Math.pow(height,2));
    double b = Math.sqrt(Math.pow(width-perpendicular,2)+Math.pow(height,2));
    return a+b+width;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (getHeight() != triangle.getHeight()) return false;
        if (getWidth() != triangle.getWidth()) return false;
        return getPerpendicular() == triangle.getPerpendicular();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + getPerpendicular();
        return result;
    }
}
