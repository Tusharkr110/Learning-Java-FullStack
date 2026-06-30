package basics.Oops;


record Bike (String brand, int speed ){ }
public class Record {

    public static void main(String args[]) {

        Bike bike = new Bike ("BMW", 232);


//        bike.brand and bike.speed used similar to getters method.
        System.out.println("Bike Brand "+bike.brand());
        System.out.println("Bike Speed "+bike.speed());

//        for toString method we can pass the obj(variable name)
        System.out.println(bike);
        System.out.println(bike.toString());


    }
//    Records are introduced to get rid of multiple creation of getter, toString methods as well as constructors for storing the data



}
