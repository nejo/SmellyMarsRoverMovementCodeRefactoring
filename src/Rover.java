public class Rover {

    private Direction directionClass;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.directionClass = new Direction(direction);
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

                if (directionClass.isPointingTo("N")) {
                    y += displacement;
                } else if (directionClass.isPointingTo("S")) {
                    y -= displacement;
                } else if (directionClass.isPointingTo("W")) {
                    x -= displacement;
                } else {
                    x += displacement;
                }
            }
        }
    }

    private void rotateToRight() {
        directionClass = directionClass.rotateToRight();
    }

    private void rotateToLeft() {
        directionClass = directionClass.rotateToLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (y != rover.y) return false;
        if (x != rover.x) return false;
        return directionClass != null ? directionClass.equals(rover.directionClass) : rover.directionClass == null;

    }

    @Override
    public int hashCode() {
        int result = directionClass != null ? directionClass.hashCode() : 0;
        result = 31 * result + y;
        result = 31 * result + x;
        return result;
    }
}
