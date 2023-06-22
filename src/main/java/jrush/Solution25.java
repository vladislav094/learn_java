package jrush;

class Point {
    Point[] points;
    private int x;
    private int y;
    private String color;

    Point() {

    }

    public Point(int size) {
        this.points = new Point[size];
    }

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected void make100object() {
        for (int i = 0; i < points.length; i++) {
            int q = i + 1;
            int w = i + 2;
            points[i] = new Point(q, w, "default");
            System.out.println(points[i].toString());
        }
    }

    protected void printAllObject() {
        for (int i = 0; i < points.length; i++) {
            System.out.println(x + " " + y + " " + color);
        }
    }
}

public class Solution25 extends Point {
    public static void main(String[] args) {
        String s;
        Point data = new Point(10);
        data.make100object();
        data.printAllObject();
    }

}
