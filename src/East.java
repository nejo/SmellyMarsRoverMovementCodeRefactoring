public class East extends Direction {

    public East() {
        super("E");
    }

    @Override
    public Direction rotateToLeft() {
        return new Direction("N");
    }

    @Override
    public Direction rotateToRight() {
        return new Direction("S");
    }
}
