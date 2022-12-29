// Constructor in Java

public class Test1 {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        p.print();
    }
}

class Point {
    int x, y;

    Point(int a, int b) {
        x = a;
        y = b;
    }

    void print() {
        System.out.println("x= " + x + ", y= " + y);
    }
}
