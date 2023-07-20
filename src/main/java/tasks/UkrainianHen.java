package tasks;

public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
