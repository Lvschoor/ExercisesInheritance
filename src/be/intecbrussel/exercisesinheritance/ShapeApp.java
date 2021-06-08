package be.intecbrussel.exercisesinheritance;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        Rectangle r1 = new Rectangle(10, 20, 5, 5);
        Rectangle r2 = new Rectangle(r1);
        System.out.println("Area of the rectangle is with width " + r1.getWidth() + " and height " + r1.getHeight() + " is: " + r1.getArea());


        Square s1 = new Square();
        System.out.print("Enter the side of the square: ");
        s1.setSide(kbd.nextInt());
        System.out.println("Area of the square is: " + s1.getArea());
        System.out.println("Perimeter of the square is: " + s1.getPerimeter());
        s1.setPosition(10, 15);
        System.out.println("The x value of the square is: " + s1.getX());

        Square s2 = new Square(12);

        Circle c1 = new Circle(15);
        System.out.print("Enter the radius of the circle: ");
        c1.setRadius(kbd.nextInt());
        System.out.println("The area of the circle with radius " + c1.getRadius() + " is " + c1.getArea());

        Circle c2 = new Circle(5, 12, 12);

        Triangle t1 = new Triangle();
        System.out.print("Enter the width of the triangle: ");
        t1.setWidth(kbd.nextInt());
        System.out.print("Enter the height of the triangle: ");
        t1.setHeight(kbd.nextInt());
        System.out.print("Enter the perpendicular of the triangle: ");
        t1.setPerpendicular(kbd.nextInt());
        System.out.print("Enter the pos x value of the triangle: ");
        t1.setX(kbd.nextInt());
        System.out.print("Enter the pos y value of the triangle: ");
        t1.setY(kbd.nextInt());

        Triangle t2 = new Triangle(6, 4, 0, 10, 10);

        IsoScelesTriangle i1 = new IsoScelesTriangle(10, 15, 5, 5);
        IsoScelesTriangle i2 = new IsoScelesTriangle(15, 8, 10, 10);


        System.out.println(r1.toString());
        System.out.println(s1.toString());
        System.out.println(c1.toString());
        System.out.println(t1.toString());
        System.out.println(i1.toString());

        System.out.println(t2.equals(t1));
        System.out.println(t2.hashCode());
        System.out.println(t1.hashCode());

        Shape[] shapes = new Shape[10];
        shapes[0] = s1;
        shapes[1] = s2;
        shapes[2] = r1;
        shapes[3] = r2;
        shapes[4] = t1;
        shapes[5] = t2;
        shapes[6] = c1;
        shapes[7] = c2;
        shapes[8] = i1;
        shapes[9] = i2;

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("This is a rectangle with width " + ((Rectangle) shape).getWidth() + " and height " + ((Rectangle) shape).getHeight());

            /*} else if (shape instanceof Square) {
                System.out.println("This is a square with width " + (Square) shape.);
*/
            } else if (shape instanceof Circle) {
                System.out.println("This is a circle with radius " + ((Circle) shape).getRadius());

            } else if (shape instanceof Triangle) {
                System.out.println("This is a triangle with width " + ((Triangle) shape).getWidth() + ", height " + ((Triangle) shape).getHeight() + " and perpendicular " + ((Triangle) shape).getPerpendicular());

            } else System.out.println("Wrong type");

            System.out.print("Perimeter " + shape.getPerimeter() + " area " + shape.getArea() + " at pos (x,y): (" + shape.getX() + "," + shape.getY() + ").\n");

        }


    }

}
