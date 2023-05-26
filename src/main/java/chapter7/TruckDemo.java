package chapter7;
class VehicleTruck {
    private int passenger;
    private int fuelcap;
    private int mpg;

    VehicleTruck(int p, int f, int m) {
        passenger = p;
        fuelcap = f;
        mpg = m;
    }

    // Дальность поездки траспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Вычисление объема тполива, требуемого
    // для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles /mpg;
    }

    // Методы для доступа к переменным экземпляра
    int getPassenger(){ return passenger; }
    void setPassenger(int passenger) { this.passenger = passenger; }
    int getFuelcap(){ return fuelcap; }
    void setFuelcap(int fuelcap) { this.fuelcap = fuelcap; }
    int getMpg() { return mpg; }
    void setMpg(int mpg) {this.mpg = mpg; }
}

// Расширение класса Vehicle для грузовиков
class Truck extends VehicleTruck{
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargocap() { return cargocap; }
    void setCargocap(int c) { cargocap = c; }
}


public class TruckDemo {
    public static void main(String[] args) {
        // Создание ряда новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " +  dist + " миль грузовику потребуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " +  dist + " миль пикапу потребуется " + gallons + " галлонов топлива.\n");

    }
}
