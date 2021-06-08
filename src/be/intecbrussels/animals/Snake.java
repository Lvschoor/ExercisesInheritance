package be.intecbrussels.animals;

public class Snake extends Animal{
    public Snake() {
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.print("crawls");
    }

    @Override
    public void makeNoise() {
        System.out.print("hisses");
    }
}
