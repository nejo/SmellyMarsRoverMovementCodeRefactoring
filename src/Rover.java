public class Rover {

    private Direction direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        switch (direction) {
            case "E":
                this.direction = new East();
                break;
            case "W":
                this.direction = new West();
                break;
            case "S":
                this.direction = new South();
                break;
            case "N":
                this.direction = new North();
                break;
        }

        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            switch (command) {
                case "l":
                    direction = this.direction.rotateToLeft();
                    break;
                case "r":
                    direction = this.direction.rotateToRight();
                    break;
                default:
                    displace(command);
                    break;
            }
        }
    }

    private void displace(String command) {
        int displacement1 = -1;

        if (command.equals("f")) {
            displacement1 = 1;
        }
        int displacement = displacement1;

        if (direction.isNorth()) {
            y += displacement;
        } else if (direction.isSouth()) {
            y -= displacement;
        } else if (direction.isWest()) {
            x -= displacement;
        } else {
            x += displacement;
        }
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
