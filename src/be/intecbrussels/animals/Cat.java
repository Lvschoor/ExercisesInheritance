package be.intecbrussels.animals;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.print("runs");
    }

    @Override
    public void makeNoise() {
        System.out.print("meows");
    }
}
