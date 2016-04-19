public class North extends Direction {
    public North() {
        super("N");
    }

    @Override
    public Direction rotateToLeft() {
        return new West();
    }

    public Direction rotateToRight() {
        return new East();
    }
}
