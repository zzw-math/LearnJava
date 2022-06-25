/**
 * 描述二维空间中的一个点
 */
public class Point {
    double x;
    double y;

    public  Point(double _x, double _y){
        x = _x;
        y = _y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4);

        System.out.println(p1.x);

    }

}
