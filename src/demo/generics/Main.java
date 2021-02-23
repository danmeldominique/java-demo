package demo.generics;

public class Main {
    

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer navim = new SoccerPlayer("Navim");

        Team<FootballPlayer> crows = new Team<>("Adelaide Crows");
        Team<SoccerPlayer> manUnited = new Team<>("Manchester United");
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");

        crows.addPlayer(joe);
        chicagoCubs.addPlayer(pat);
        manUnited.addPlayer(navim);

        FootballPlayer bob = new FootballPlayer("Bob");
        BaseballPlayer matt = new BaseballPlayer("Matt");
        SoccerPlayer pushin = new SoccerPlayer("Pushin");

        Team<FootballPlayer> demons = new Team<>("Melbourne Demons");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<BaseballPlayer> dodgers = new Team<>("LA Dodgers");

        demons.addPlayer(bob);
        arsenal.addPlayer(pushin);
        dodgers.addPlayer(matt);

        crows.matchResult(demons, 56, 77);
        chicagoCubs.matchResult(dodgers, 34, 12);
        manUnited.matchResult(arsenal, 4, 4);

        System.out.println("Rankings");
        System.out.println(crows.compareTo(demons));
        System.out.println(manUnited.compareTo(arsenal));


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        footballLeague.addTeam(crows);
        footballLeague.addTeam(demons);
        footballLeague.showLeagueTable();
    }
}
