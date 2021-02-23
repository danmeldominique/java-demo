package demo.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, Integer> tempExit = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java.",tempExit));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge.",tempExit));
        locations.put(2, new Location(2, "You are at the top of a hill.",tempExit));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring.",tempExit));
        locations.put(4, new Location(4, "You are in a valley beside a stream.",tempExit));
        locations.put(5, new Location(5, "You are in a forest.",tempExit));

        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);

        tempExit.put("N", 5);

        tempExit.put("W", 1);

        tempExit.put("N", 1);
        tempExit.put("W", 2);

        tempExit.put("S", 1);
        tempExit.put("W", 2);


        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = in.nextLine().toUpperCase();

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
