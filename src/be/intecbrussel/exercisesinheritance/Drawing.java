package be.intecbrussel.exercisesinheritance;

import java.util.Arrays;

public class Drawing {
    private Shape[] shapes = new Shape[100];
    private int size;

    public void add(Shape shape) {
        if (!isPresent(shapes, shape)) {
            size++;
            shapes[getFreeLocation(shapes)] = shape;
        } else {
            System.out.println("Shape already in array");
        }
    }

    public int getFreeLocation(Shape[] shapes) {
        int freeLocation;
        for (freeLocation = 0; freeLocation < shapes.length; freeLocation++) {
            if (shapes[freeLocation] == null) {
                break;
            }
        }
        return freeLocation;
    }

    public Boolean isPresent(Shape[] shapes, Shape newShape) {
        for (Shape shape : shapes) {
            if (shape == newShape) {
                return true;
            }
        }
        return false;
    }

    public void remove(Shape oldShape) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == oldShape) {
                shapes[i] = null;
                size--;
                break;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = null;
            size = 0;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                ", size=" + size +
                '}';
    }
}
