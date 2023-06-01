package leetcode;

public class HammingWeight {
    public static int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int total = 0;
        for (int i = 0; i < binary.length(); i++ ) {
            int temp = Character.getNumericValue(binary.charAt(i));
            if (temp == 1) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int int1 = 00000000000000000000000000001011;
        System.out.println(Integer.toBinaryString(int1));
        System.out.println(hammingWeight(int1));
    }
}
