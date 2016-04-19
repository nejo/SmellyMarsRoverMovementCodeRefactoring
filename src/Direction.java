public class Direction {

    private String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public boolean isPointingTo(String direction) {
        return this.direction.equals(direction);
    }

    public Direction rotateToRight() {
        if (direction.equals("N")) {
            return new Direction("E");
        } else if (direction.equals("S")) {
            return new Direction("W");
        } else if (direction.equals("W")) {
            return new Direction("N");
        } else {
            return new Direction("S");
        }
    }

    public Direction rotateToLeft() {
        if (direction.equals("N")) {
            return new Direction("W");
        } else if (direction.equals("S")) {
            return new Direction("E");
        } else if (direction.equals("W")) {
            return new Direction("S");
        } else {
            return new Direction("N");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        return direction != null ? direction.equals(direction1.direction) : direction1.direction == null;

    }

    @Override
    public int hashCode() {
        return direction != null ? direction.hashCode() : 0;
    }
}
