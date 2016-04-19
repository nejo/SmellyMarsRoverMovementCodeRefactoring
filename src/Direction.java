public class Direction {

    protected String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public Direction rotateToRight() {
        if (isNorth()) {
            return new East();
        } else if (isSouth()) {
            return new Direction("W");
        } else if (isWest()) {
            return new Direction("N");
        } else {
            return new Direction("S");
        }
    }

    public boolean isWest() {
        return direction.equals("W");
    }

    public boolean isNorth() {
        return direction.equals("N");
    }

    public boolean isSouth() {
        return direction.equals("S");
    }

    public Direction rotateToLeft() {
        if (isNorth()) {
            return new Direction("W");
        } else if (isSouth()) {
            return new East();
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
