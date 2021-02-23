package demo.abstraction;

import java.util.ArrayList;

public class Main {
    

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        // dog.breathe();
        // dog.eat();

        Parrot bird = new Parrot("Australian ringneck");
        // bird.breathe();
        // bird.eat();
        // bird.fly();

        Penguin penguin = new Penguin("Emperor Penguin");
        // penguin.breathe();
        // penguin.eat();
        // penguin.fly();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(bird);
        animals.add(penguin);

        for (Animal animal : animals) {
            System.out.println("I am an " + animal.getName() + ".");
            animal.eat();
            animal.breathe();
        }
    }
}
