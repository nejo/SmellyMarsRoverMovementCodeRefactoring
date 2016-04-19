public class South extends Direction {
    public South() {
        super("S");
    }

    @Override
    public Direction rotateToLeft() {
        return new East();
    }

    @Override
    public Direction rotateToRight() {
        return new West();
    }
}
