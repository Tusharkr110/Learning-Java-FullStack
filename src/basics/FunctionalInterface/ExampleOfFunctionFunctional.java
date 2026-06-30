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

        List<String> items = Arrays.asList("Apple","Banana","Orange","Mango");
        Stream<String> stream1 = items.stream();

        stream1.forEach((item)-> System.out.println(item));

        Stream<String> stream2 = items.stream();
        Stream<String> fil = stream2.filter(name-> name.startsWith("B"));
        fil.forEach((ints)-> System.out.println(ints));


        Iterator<String > it = items.iterator();
        while(it.hasNext())
            System.out.println(it.next());




    }
}
