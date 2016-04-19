public class West extends Direction {
    public West() {
        super("W");
    }

    @Override
    public Direction rotateToLeft() {
        return new Direction("S");
    }

    @Override
    public Direction rotateToRight() {
        return new Direction("N");
    }
}
