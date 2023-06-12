package practices;

class MyClass{
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.setAlpha(-99);
        System.out.println("obj.alpha: " + obj.getAlpha());

        obj.beta = 88;
        obj.gamma = 99;
    }

}
