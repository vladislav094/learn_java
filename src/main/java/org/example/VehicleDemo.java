package org.example;

class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;
}
public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passenger = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        range = minivan.fuelcap * minivan.mpg;
        System.out.println(range);
    }
}
