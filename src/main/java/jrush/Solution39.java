package jrush;


class Car {

    public Car(String type) {
        System.out.println("Привет. Я " + type);
    }
}

class HybridCar extends Car {

    public HybridCar() {
        //напишите тут ваш код
        super("HybridCar");
    }
}

class GasCar extends Car {

    public GasCar() {
        //напишите тут ваш код
        super("GasCar");
    }
}
class ElectricCar extends Car {

    public ElectricCar() {
        //напишите тут ваш код
        super("ElectricCar");
    }
}


public class Solution39 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HybridCar hybridCar = new HybridCar();
    }
}
