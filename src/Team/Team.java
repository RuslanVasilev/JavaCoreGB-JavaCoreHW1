package Team;

import Homework1.Status;

public class Team {

    private TeamMember[] members;

    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() { return members; }

    public void ShowResults() {
        printLine();
        System.out.println(" Полосу препятствий проходила команда: " + name);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printLine();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printLine();
        System.out.println(member.getName() + " Не прошёл полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printLine();
        System.out.println(member.getName() + " Прошёл полосу препятствий");
    }

    private void printLine() {
        System.out.println("--------------------------------------");
    }
}
