package L01Points;

public class Main {
    public static void main(String[] args) throws Exception {

        Point2D a = new Point2D(0, 0);
        System.out.println(a);
        a.setX(2    );
        Point2D b = new Point2D(2   );
        System.out.println(b);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);

    }
}
