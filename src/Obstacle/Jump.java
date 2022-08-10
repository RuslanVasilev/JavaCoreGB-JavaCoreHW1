package Obstacle;

import Team.TeamMember;

public class Jump extends Obstacle{
    public Jump(int difficulty) {
        super(difficulty);
    }
    public void goChallenge (TeamMember member) {member.jump(super.getDifficulty());
    }
}

