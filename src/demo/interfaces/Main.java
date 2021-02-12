package demo.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "0 to quit\n" + "1 to enter a string");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = in.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        in.close();
        return values;
        
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving" + objectToSave.write().get(i) + " to storage device...");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static void main(String[] args) {

        ISaveable daniel = new Player("Daniel", 10, 15);
        ISaveable werewolf = new Monster("Werewolf", 8, 13, "Fangs");
        // System.out.println(daniel);
        // System.out.println(werewolf);
        // saveObject(daniel);
        // saveObject(werewolf);
        // ((Player) daniel).setHitPoints(8);
        // ((Monster) werewolf).setHitPoints(5);
        // System.out.println(daniel);
        // System.out.println(werewolf);
        // ((Player) daniel).setWeapon("StormBringer");
        // saveObject(daniel);
        // loadObject(daniel);
        // saveObject(werewolf);
        // loadObject(werewolf);
        // System.out.println(daniel);
        // System.out.println(werewolf);

        List<ISaveable> characters = new ArrayList<ISaveable>();
        characters.add(daniel);
        characters.add(werewolf);
        Iterator<ISaveable> i = characters.iterator();
        while(i.hasNext()) {
            
            Monster test = (Monster) i.next();
            test.toString();
            
        }
    }
}
