class Factorial {
    int factoR(int n) {
        int result;
        if (n == 1) return 1;
        result = factoR(n-1) * n;
        System.out.println(result);
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factoR(6));
    }
}
