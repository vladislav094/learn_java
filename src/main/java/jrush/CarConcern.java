package jrush;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;


    public CarConcern(String model, int year, String color) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        //напишите тут ваш код
        this.color = "Оранжевый";
        this.model = model;
        this.year = year;
    }

    public CarConcern(String model) {
        //напишите тут ваш код
        this.color = "Оранжевый";
        this.year = 4321;
        this.model = model;
    }
}
