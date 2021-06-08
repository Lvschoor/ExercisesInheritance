package be.intecbrussels.animals;

public class Fish extends Animal{


    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.print("swims");
    }

    @Override
    public void makeNoise() {
        System.out.print("says blub blub");

    }
}
