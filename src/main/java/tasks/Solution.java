package tasks;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen2.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.BELARUS:
                    return new BelarusianHen();
                case Country.MOLDOVA:
                    return new MoldovanHen();
                case Country.UKRAINE:
                    return new UkrainianHen();
                case Country.RUSSIA:
                    return new RussianHen();
                default:
                    return hen;
            }
        }
    }

}
