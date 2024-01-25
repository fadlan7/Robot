public class Robot {

    private Direction direction;
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Robot(Direction direction, Integer x, Integer y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void turnRight() {
        direction = direction.values()[(direction.ordinal() + 1 + direction.values().length) % direction.values().length];
    }

    public void turnLeft() {
        direction = direction.values()[(direction.ordinal() - 1 + direction.values().length) % direction.values().length];
    }

    public void moveForward() {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y--;
                break;
            case WEST:
                x--;
                break;
        }
    }
}
