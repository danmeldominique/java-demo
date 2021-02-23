package demo.generics;

import java.util.ArrayList;
import java.util.Collections;


public class League<T extends Team<?>> {
    
    private String name;
    private ArrayList<T> teams = new ArrayList<T>();


    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    
    public String getName() {
        return this.name;
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        for(T t: teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
