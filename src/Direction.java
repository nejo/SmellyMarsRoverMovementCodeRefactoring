public class Direction {

    private String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public boolean isPointingTo(String direction) {
        return this.direction.equals(direction);
    }

    public Direction rotateToRight() {
        if (isNorth()) {
            return new Direction("E");
        } else if (isSouth()) {
            return new Direction("W");
        } else if (isWest()) {
            return new Direction("N");
        } else {
            return new Direction("S");
        }
    }

    private boolean isWest() {
        return direction.equals("W");
    }

    private boolean isNorth() {
        return direction.equals("N");
    }

    private boolean isSouth() {
        return direction.equals("S");
    }

    public Direction rotateToLeft() {
        if (isNorth()) {
            return new Direction("W");
        } else if (isSouth()) {
            return new Direction("E");
        } else if (isWest()) {
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
