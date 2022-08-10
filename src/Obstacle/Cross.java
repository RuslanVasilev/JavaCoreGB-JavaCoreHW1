package Obstacle;

import Team.TeamMember;

public class Cross extends Obstacle {
    public Cross (int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge (TeamMember member) {member.cross(super.getDifficulty());}
}
