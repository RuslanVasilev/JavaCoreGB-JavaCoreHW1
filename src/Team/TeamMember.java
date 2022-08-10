package Team;

import Homework1.Status;

public class TeamMember {

    private Status status = Status.NoPassedDistance;

    private final String name;

    private final int power;

    public TeamMember(String name, int power) {

        this.name = name;

        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void jump(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил в прыжках в длинну");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в прыжках в длинну");
        }
    }

    public void cross(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил беге на 100 метров");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в беге на 100 метров");
        }
    }

    public void swimming(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Победил в прыжках в воду");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Проиграл в прыжках в воду");
        }
    }

    public void flight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus (Status.PassedDistance, " Перепрыгнул трамплин");
        }
        else {
            changeStatus (Status.NoPassedDistance, " Не перепрыгнул трамплин");
        }
    }

    private boolean checkPower(int courseDifficulty) { return power > courseDifficulty || power == courseDifficulty; }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }
}
