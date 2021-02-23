package demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level programming language");
        languages.put("Python", "An interpreted, object oriented high level programming language");
        languages.put("Ruby", "A high level programming language");
        languages.put("Javascript", "A high level scripting language used for web development");

        if(languages.containsKey("Jasva")) {
            System.out.println("Java is in the map");
        } else {
            System.out.println("Java is not in the map.");
        }

        System.out.println(languages.keySet());
        languages.remove("Ruby");
        System.out.println(languages.keySet());
    }
}
