package basics.DemoCollec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DemoList
{
    public static void main() {
        System.out.println();
        //    Collection: Group of objects
        /*
         * List
         * Queue
         * Map
         * Set
         * Array vs Collections
         *
         * Fixed Size || Dynamic Size
         * Same Data Type || Heterogeneous Data Type
         * Lacks ready-made methods for common operations || Comes with ready-made methods for common operation
         *
         *
         *
         * LIST
         * Ordered and allows duplicate
         *

    * If Using forEach loop for printing then we must use
    *  for( Object a : ListName)
    *
    * Object class for taking objects of list as it store in the form of object instead of dataTypes
         */

//        List users = new ArrayList<>();
//
//        users.add("Alice");
//        users.add("Bob");
//        users.add("Charlie");
//        users.add(23423);
//        users.add(243.5234);
//        users.add(true);
//        users.add('s');
//
//
////      Due to Generic The List is now constrained to use only Integer object Data.
//        List<Integer> restrictionToInputsUsingGenericDataType = new ArrayList();
//
////      this will Give Error
////        restrictionToInputsUsingGenericDataType.add("gsd");
//
//        restrictionToInputsUsingGenericDataType.add(2344);
//
//
//        System.out.println(restrictionToInputsUsingGenericDataType);
//
//
//
//        System.out.println("All Users");
//
//        System.out.println(users);
//
//        for(Object a : users){
//            System.out.println(a);
//        }


        Car car1 = new Car("Tata");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Benz");


        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

//        System.out.println(carList.toString());    if override .toString in Car class
//        System.out.println(carList); //output are objects

//        for (Car car : carList){
//            System.out.println(car.brand);
//        }

        //        USING ITTERATOR
        Iterator<Car> it = carList.iterator();
//
        while (it.hasNext()) {
            Car car = it.next();
            System.out.println(car.brand);
        }

//        Iterator<Car> its = carList.iterator();
//        while(it.hasNext()){
//            Car car = its.next();
//            System.out.println(its.next());
//        }
    }
}

class Car{
    String brand;

    public Car(String brand){
        this.brand = brand;
    }

//    @Override
//    public String toString(){
//        return brand;
//    }
}
