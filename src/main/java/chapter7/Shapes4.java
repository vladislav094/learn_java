package chapter7;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    void setWidth(double w) { width = w; }

    void setHeight(double h) { height = h; }

    double getWidth() { return width; }
    double getHeight() {return height;}

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4(String s, double w, double h) {
        super(w, h); // вызов конструктора суперкласса
        style = s;
    }
    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangle4 extends TwoDShape4 {
    Rectangle4(double w, double h) {
        super(w, h);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getHeight() * getWidth();
    }
}


public class Shapes4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("Info about of t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Square - " + t1.area());

        System.out.println();

        System.out.println("Info about of t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Square - " + t2.area());

    }
}
