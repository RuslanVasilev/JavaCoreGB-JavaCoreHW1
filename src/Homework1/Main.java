package Homework1;

import Obstacle.*;
import Team.Team;
import Team.TeamMember;


public class Main {

    public static void main(String[] args) {
        Team newTeam = new Team ("Тупарь",
        new TeamMember("Миша", 5),
        new TeamMember("Саша", 6),
        new TeamMember("Лёха", 6),
        new TeamMember("Дима", 7));

        Course course = new Course(new Cross(5), new Swimming(6), new Jump(4), new Flight(7));
        course.doIt(newTeam);
        System.out.println();
    }

}
