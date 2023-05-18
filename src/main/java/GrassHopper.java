public class GrassHopper{
    public static int summation(int n) {
        int[] arrayIntegers = new int[n];
        int total = 0;
        for(int i = 0; i < n; i ++) {
            arrayIntegers[i] = i + 1;
            total += arrayIntegers[i];
        }
        String x = "laststrig";
        for(char i : x.toCharArray()){
            System.out.println(i);
        }

        return total;
    }
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(8));
    }
}
