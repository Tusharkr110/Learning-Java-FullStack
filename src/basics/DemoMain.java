package basics;

import basics.Oops.Car;

public class DemoMain {
    public static void main(String args[]){

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car("Honda","White",255);

        c3.drive();
        c1.setBrand("Benz");
        c1.setColor("Creamy White");
        c1.setSpeed(56);
        c1.setBrand("Kia");
        c2.setColor("White");
        c2.setSpeed(56);
        c2.drive();

    }
}
