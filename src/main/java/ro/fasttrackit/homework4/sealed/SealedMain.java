package ro.fasttrackit.homework4.sealed;

import java.util.ArrayList;
import java.util.List;

public class SealedMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Canary("pink"));
        animals.add(new Cat("Zsizell"));
        animals.add(new Chicken());
        animals.add(new Dog());
        animals.add(new Fly());
        animals.add(new Ladybug(7));
        animals.add(new Parrot());

        animals.forEach(animal -> System.out.println(animal.type() + " can fly - " + animal.canFly()));
    }
}
