package chapter7;

class TwoDShapes{
    private double width;
    private double height;
    private String name;

    TwoDShapes() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShapes(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShapes(double x, String name) {
        width = height = x;
        this.name = name;
    }

    TwoDShapes(TwoDShapes obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double width) { this.width = width; }
    void  setHeight(double height) { this.height = height; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double getArea() {
        System.out.println("Метод area() должен быть переопределен");
        return  0.0;
    }
}

class Triangles extends TwoDShapes {
    private String style;

    Triangles() {
        super();
        style = "none";
    }

    Triangles(String style, double width, double height) {
        super(width, height, "треугольник");
        this.style = style;
    }

    Triangles(double x) {
        super(x, "треугольник");
        this.style = "закрашенный";
    }

    Triangles(Triangles obj) {
        super(obj);
        this.style = obj.style;
    }

    double getArea() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangles extends TwoDShapes{

    Rectangles() {
        super();
    }

    Rectangles(double width, double height) {
        super(width, height, "прямоугольник");
    }

    Rectangles(double x){
        super(x, "прямоугольник");
    }

    Rectangles(Rectangles obj) {
        super(obj);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double getArea() {
        return getHeight() * getWidth();
    }
}

public class DynShapes {
    public static void main(String[] args) {
        TwoDShapes[] shapes = new TwoDShapes[5];
        shapes[0] = new Triangles("контурный", 8.0, 12.0);
        shapes[1] = new Rectangles(10);
        shapes[2] = new Rectangles(10, 4);
        shapes[3] = new Triangles(7.0);
        shapes[4] = new TwoDShapes(10, 20, "фигура");

        for(int i=0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].getArea());
            System.out.println();
        }
    }
}
