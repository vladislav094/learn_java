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
    };

    static String greet(String name, String owner) {
        // Add code here
        String helloBoss = "Hello boss";
        String helloGuest = "Hello guest";
        if(name.compareToIgnoreCase(owner) == 0) return helloBoss;
        else return helloGuest;
    };

    public static String countingSheep(int num) {
        //Add your code here
        String someText = " sheep...";
        StringBuffer resultText = new StringBuffer();
        if(num > 0)
//            {
//            for (int i = 0; i < num; i++) {
//                resultText = resultText + (i + 1) + someText;
//            }
//        }
        {for (int i = 0; i < num; i++) resultText.append(i+1).append(someText);}
        return resultText.toString();
    }



    public static void main(String[] args) {
        int[] myArray = {100, 90};
        System.out.println(Kata.betterThanAverage(myArray, 11));
        System.out.println(Kata.greet("Daniel", "daniell"));
        System.out.println(Kata.countingSheep(5));
    }
}
