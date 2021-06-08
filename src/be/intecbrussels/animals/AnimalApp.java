package be.intecbrussels.animals;

public class AnimalApp {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        Fish nemo = new Fish("Nemo");
        Bird tweety = new Bird("Tweety");
        Snake kaa = new Snake("Kaa");

        System.out.print("Cat " + tom.getName() + " ");
        tom.move();
        System.out.print(" and ");
        tom.makeNoise();
        System.out.println(".");

        System.out.print("Fish " + nemo.getName() + " ");
        nemo.move();
        System.out.print(" and ");
        nemo.makeNoise();
        System.out.println(".");

        System.out.print("Bird " + tweety.getName()+" ");
        tweety.move();
        System.out.print(" and ");
        tweety.makeNoise();
        System.out.println(".");

        System.out.print("Snake " + kaa.getName()+" ");
        kaa.move();
        System.out.print(" and ");
        kaa.makeNoise();
        System.out.println(".");



    }
}
