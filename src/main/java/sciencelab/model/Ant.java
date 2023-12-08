package sciencelab.model;

public class Ant {
    private final String name;
    private static final int STEP = 1;
    private Direction direction;
    private int position;


    public Ant(String name, Direction direction, int position) {
        this.name = name;
        this.direction = direction;
        this.position = position;
    }

    public void move() {
        if (direction.equals(Direction.LEFT))
            position--;
        else
            position++;
    }

    public String getName() {
        return name;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

