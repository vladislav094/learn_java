public class GrassHopper{
    public static int summation(int n) {
        int[] arrayIntegers = new int[n];
        int total = 0;
        for(int i = 0; i < n; i ++) {
            arrayIntegers[i] = i + 1;
            total += arrayIntegers[i];
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(8));
    }
}
