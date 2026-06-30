package basics.FunctionalInterface;

//it only supplies not take any input but provides output
// to use .get()

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {

        Consumer<Integer> intGER = a -> {System.out.println("This is to inform you, it is a consumer Functional interface");};
    public void main(String args[]) {

        SupplierDemo sc = new SupplierDemo();

        sc.intGER.accept(23);

        Supplier<Long> randomNum = () -> (long)(Math.random()*100);
        Supplier<Double> randomNum2 = Math::random; //same-same


        System.out.println(randomNum.get());
        System.out.println(100*(randomNum2.get()));
    }
}
