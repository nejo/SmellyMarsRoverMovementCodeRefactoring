public class East extends Direction {

    public East() {
        super("E");
    }

    @Override
    public Direction rotateToLeft() {
        return new North();
    }

    @Override
    public Direction rotateToRight() {
        return new South();
    }
}
