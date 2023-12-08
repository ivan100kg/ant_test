package sciencelab.model;

public enum Direction {
        LEFT, RIGHT;
        public static Direction inverseDirection(Direction direction) {
                if (direction.equals(LEFT))
                        return RIGHT;
                else
                        return LEFT;
        }
}
