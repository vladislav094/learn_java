public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int total = 0;
        double average;
        for(int x: classPoints){
            total += x;
        }
        average = total / classPoints.length;
        return true ? yourPoints > average : false;
    }

    public static void main(String[] args) {
        int[] myArray = {100, 90};
        System.out.println(Kata.betterThanAverage(myArray, 11));
    }
}
