public enum Direction {
    NORTH, //0
    EAST, //1
    SOUTH, //2
    WEST; //3

    public Direction turnRight() {
        return Direction.values()[(this.ordinal() + 1 + values().length) % values().length];
    }

    public Direction turnLeft() {
        return Direction.values()[(this.ordinal() - 1 + values().length) % values().length];
    }
}
