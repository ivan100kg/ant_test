package sciencelab;

import sciencelab.model.Ant;
import sciencelab.model.Direction;
import sciencelab.model.Plank;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // data
        int plankSize = 4;
        int leftPosition = 4;
        int rightPosition = 3;

        Ant leftAnt = new Ant("Left Ant", Direction.LEFT, leftPosition);
        Ant rightAnt = new Ant("Right Ant", Direction.RIGHT, rightPosition);
        Plank plank = new Plank(plankSize, leftAnt, rightAnt);
        Action action = new Action(plank);

        action.startAction();

        System.out.println("Finish for: " + action.getRound() + " rounds");
    }
}
