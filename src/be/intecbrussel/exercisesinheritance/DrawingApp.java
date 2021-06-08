package be.intecbrussel.exercisesinheritance;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Rectangle r1 = new Rectangle(10, 20, 5, 5);
        Square s2 = new Square(12);
        Circle c1 = new Circle(15);
        Circle c2 = new Circle(5, 12, 12);

        drawing.add(r1);
        System.out.println(drawing.getSize());
        System.out.println(drawing);
        drawing.add(s2);
        System.out.println(drawing.getSize());
        System.out.println(drawing);
        drawing.add(c1);
        System.out.println(drawing.getSize());
        System.out.println(drawing);
        drawing.remove(s2);
        System.out.println(drawing.getSize());
        System.out.println(drawing);
        drawing.add(c2);
        System.out.println(drawing.getSize());
        System.out.println(drawing);

        drawing.clear();
        System.out.println(drawing.getSize());
        System.out.println(drawing);





    }
}
