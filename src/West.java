public class West extends Direction {
    public West() {
        super("W");
    }

    @Override
    public Direction rotateToLeft() {
        return new South();
    }

    @Override
    public Direction rotateToRight() {
        return new Direction("N");
    }
}
