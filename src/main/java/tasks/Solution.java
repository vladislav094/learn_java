package tasks;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            return hen;
        }
    }

    public abstract class Hen {
        abstract int getCountEggsPerMonth();

        String getDescription() {
            return "Я - курица.";
        }
    }

    public class RussianHen extends Hen {
        private String country = "Россия";

        @Override
        int getCountEggsPerMonth() {
            return 1;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя странная - " + this.country + getCountEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class UkrainianHen extends Hen {
        private String country = "Украина";

        @Override
        int getCountEggsPerMonth() {
            return 2;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя странная - " + this.country + getCountEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class MoldovanHen extends Hen {
        private String country = "Молдавия";

        @Override
        int getCountEggsPerMonth() {
            return 3;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя странная - " + this.country + getCountEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class BelarusianHen extends Hen {
        private String country = "Беларусь";

        @Override
        int getCountEggsPerMonth() {
            return 4;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя странная - " + this.country + getCountEggsPerMonth() + " яиц в месяц.";
        }
    }
}
