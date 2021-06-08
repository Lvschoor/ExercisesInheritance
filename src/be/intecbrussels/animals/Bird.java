package be.intecbrussels.animals;

public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.print("flies");
    }

    @Override
    public void makeNoise() {
        System.out.print("sings");

    }
}
