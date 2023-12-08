package sciencelab;

import sciencelab.model.Ant;
import sciencelab.model.Direction;
import sciencelab.model.Plank;

public class Action {
    private final Plank plank;
    private final Ant leftAnt;
    private final Ant rightAnt;
    private int round;

    public Action(Plank plank) {
        this.plank = plank;
        this.round = 0;
        this.leftAnt = plank.getLeftAnt();
        this.rightAnt = plank.getRightAnt();
    }

    private void nextRound() {
        round++;
        System.out.println("Round: " + round);
        System.out.println("Left ant position: " + leftAnt.getPosition());
        System.out.println("Right ant position: " + rightAnt.getPosition());
        leftAnt.move();
        if(isCollision()) {
            leftAnt.setDirection(Direction.inverseDirection(leftAnt.getDirection()));
            leftAnt.move();
            rightAnt.setDirection(Direction.inverseDirection(rightAnt.getDirection()));
            leftAnt.move();
        }
        rightAnt.move();
        if(isCollision()) {
            rightAnt.setDirection(Direction.inverseDirection(rightAnt.getDirection()));
            rightAnt.move();
            leftAnt.setDirection(Direction.inverseDirection(leftAnt.getDirection()));
            rightAnt.move();
        }
    }

    private boolean isCollision() {
        return leftAnt.getPosition() == rightAnt.getPosition();
    }

    public void startAction() {
        System.out.println("Start the game!");
        while (!plank.isAntFall())
            nextRound();
    }

    public int getRound() {
        return round;
    }
}
