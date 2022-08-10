package Obstacle;

import Team.TeamMember;

public class Swimming extends Obstacle{
    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge (TeamMember member) {member.swimming(super.getDifficulty());
    }
}
