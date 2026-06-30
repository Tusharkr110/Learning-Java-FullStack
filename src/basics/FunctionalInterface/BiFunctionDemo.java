package basics.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//an in-built FUNCTION functional interface called Bifunction which accepts 2 arguments and gives one output
public class BiFunctionDemo {
    public static BiFunction<Integer, Integer, Integer> addFunction = (a,b ) -> a+b;

    public static BiFunction<Integer, Integer, Integer> subFunction = (a,b ) -> a-b;

//  public static BiFunction<Integer, Integer, Integer> addFunction = Integer::sum ; // here sum is predefined method reference

    public BiFunction<String, String, String> concatinate = (a,b) -> (a +" "+ b);


    public static void main(String args[]) {

//      if we do not use static in definition of BiFunction then, we require to create an object of the class to call
        BiFunctionDemo bi = new BiFunctionDemo();

        System.out.println(bi.concatinate.apply("Tushar", "Kumar"));

        System.out.println(addFunction.apply(234,342));

//      combining FUNCTION and BIFUNCTION functional interfaces using (andThen) method

        Function<Integer,Integer> multiplyBy2 = x -> x*2;

        BiFunction<Integer, Integer, Integer> combinedFunction = subFunction.andThen(multiplyBy2);

        System.out.println(combinedFunction.apply(234,342));









    }


}



