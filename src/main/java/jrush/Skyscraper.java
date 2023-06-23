package jrush;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    //напишите тут ваш код
    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public Skyscraper(){
        this.developer = "JavaRushDevelopment";
        this.floorsCount = 5;
    }
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
