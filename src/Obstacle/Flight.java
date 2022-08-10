package Obstacle;

import Team.TeamMember;

public class Flight extends Obstacle {
    public Flight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {member.flight(super.getDifficulty());}
}
