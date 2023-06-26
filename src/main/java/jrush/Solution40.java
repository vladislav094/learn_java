package jrush;

class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}


public class Solution40 {
    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City dubai = new City("Дубай", 40);
        showWeather(dubai);
    }
}
