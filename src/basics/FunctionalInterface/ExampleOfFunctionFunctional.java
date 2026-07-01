package basics.FunctionalInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class ExampleOfFunctionFunctional {

    public  static BiFunction<String ,Double, String> formatter = (a,b)-> a+ " costs $"+b;
    public  static BiConsumer<String ,Double> formatterConsumer = (a, b)-> System.out.println(a+ " costs $"+b);

    static void main(String[] args) {

//        Using BiFunction
        System.out.println(formatter.apply("Java Basics",234.23));
        System.out.println(formatter.apply("Python Basics",Math.random()*199));;
        System.out.println(formatter.apply("C Basics",Math.random()*199));;
        System.out.println(formatter.apply("C++ Basics",Math.random()*199));;

        System.out.println();

//        Using BiConsumer
        formatterConsumer.accept("Java Basics",234.23);
        formatterConsumer.accept("Python Basics",Math.random()*199);
        formatterConsumer.accept("C Basics",Math.random()*199);
        formatterConsumer.accept("C++ Basics",Math.random()*199);




    }
}
