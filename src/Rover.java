public class Rover {

    private Direction direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.direction = new Direction(direction);
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            if (command.equals("l")) {
                rotateToLeft();
            } else if (command.equals("r")) {
                rotateToRight();
            } else {

                // Displace Rover
                int displacement1 = -1;

                if (command.equals("f")) {
                    displacement1 = 1;
                }
                int displacement = displacement1;

                if (direction.isPointingTo("N")) {
                    y += displacement;
                } else if (direction.isPointingTo("S")) {
                    y -= displacement;
                } else if (direction.isPointingTo("W")) {
                    x -= displacement;
                } else {
                    x += displacement;
                }
            }
        }
    }

    private void rotateToRight() {
        direction = direction.rotateToRight();
    }

    private void rotateToLeft() {
        direction = direction.rotateToLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (y != rover.y) return false;
        if (x != rover.x) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + y;
        result = 31 * result + x;
        return result;
    }
}
