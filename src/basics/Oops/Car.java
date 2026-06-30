package basics.Oops;

public class Car {


    public Car(){
        super();
    }
    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    String brand;
    String color;
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



        public void drive(){
            System.out.println(brand+ " is of "+color+" color, is driving with the speed of "+ speed+"kmph");

    }
}


//        There are 4 OOPS Principles
//        In OOPS everything is represented in the form of Objects.
//        Objects are instances of classes
//        Class is like a blueprint, object is a real thing built from that blueprint


/*
          1) Encapsulation
          2) Abstraction
          3) Polymorphism
          4) Inheritance

*/