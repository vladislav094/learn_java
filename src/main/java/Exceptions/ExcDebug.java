package Exceptions;

public class ExcDebug {

    private static ExcDebugHelper abc;

    public static void foo(){
        abc.show();
    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (Exception e) {
            System.err.println("It was Null Pointer Exception");
            e.printStackTrace();
        }
    }
}
