package demo.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPlayed() {
        return this.played;
    }

    public int getWon() {
        return this.won;
    }

    public int getLost() {
        return this.lost;
    }

    public int getTied() {
        return this.tied;
    }

    public int numberOfPlayers() {
        return this.members.size();
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already one the team.");
            return false;
        }
        else {
            members.add(player);
            System.out.println(player.getName() + " was added to the team " + this.name);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            message = " won against ";
            won++;
        } else if (ourScore == theirScore) {
            message = " tied against ";
            tied++;
        } else {
            message = " lost against ";
            lost++;
        }
        if (opponent != null) {
            System.out.println("RESULTS: " + this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }

    
}
