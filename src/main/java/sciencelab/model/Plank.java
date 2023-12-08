package sciencelab.model;

public class Plank {
    private final int plankSize;
    private final Ant leftAnt;
    private final Ant rightAnt;

    public Plank(int plankSize, Ant leftAnt, Ant rightAnt) {
        this.plankSize = plankSize;
        this.leftAnt = leftAnt;
        this.rightAnt = rightAnt;
    }

    public boolean isAntFall() {
        return (leftAnt.getPosition() > plankSize ||
                leftAnt.getPosition() < 0 ||
                rightAnt.getPosition() > plankSize ||
                rightAnt.getPosition() < 0);
    }

    public int getPlankSize() {
        return plankSize;
    }

    public Ant getLeftAnt() {
        return leftAnt;
    }

    public Ant getRightAnt() {
        return rightAnt;
    }
}
