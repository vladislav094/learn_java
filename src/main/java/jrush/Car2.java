package jrush;

/*
Создаем свой hashCode
*/

public class Car2 {
    private String model;
    private int year;

    public Car2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public int hashCode() {
        return model.hashCode() + year;
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Car2 lamborghini = new Car2("Lamborghini", 2020);
        Car2 lamborghini1 = new Car2("Lamborghini", 2020);
        Car2 ferrari = new Car2("Ferrari", 2020);
        Car2 ferrari1 = new Car2("Ferrari", 2020);
        Car2 bugatti = new Car2("Bugatti", 2020);
        Car2 bugatti1 = new Car2("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
