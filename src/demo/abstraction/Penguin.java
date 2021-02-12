package demo.abstraction;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not ery good at that. can we go for a swim instead?");

    }
    
}
