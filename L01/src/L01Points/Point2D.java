package L01Points;

/**
 * Это точка 2D
 */

public class Point2D {
    private int x, y; // это очень мощный комментарий, говорящий, что икс - это икс, а игрек - это игрек.

    /**
     * Это конструктор...
     * @param valueX - это координата X
     * @param valueY - это координата Y
     */

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
        // this.x = value;
        // this.y = value;
    }

    public Point2D() {
        this(0);
    }

    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }

    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

}
