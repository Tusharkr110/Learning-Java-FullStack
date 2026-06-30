package basics.FunctionalInterface;

import java.util.function.Consumer;

//similarly we have BiConsumer 2 input no output
//Predicate have single input boolean output (here we use .test())
//Similarly, 2 inputs and single boolean output.


public class ConsumerFunctionDemo {
//Represents an operation that accepts a single
//input argument and returns no result. Unlike most
//other functional interfaces, Consumer is expected
//to operate via side-effects.
//This is a functional interface whose functional
//method is accept (Object) .
    public Consumer<String> cons = a -> {
        System.out.println("It just Accepts an argument and does not return any thing. it just processes. ");
    System.out.println(a+ " This is the input but does not gives output similar to void return type");
    };

    public Consumer<String> cons1 = a -> System.out.println(a);
    public Consumer<String> cons2 = System.out::println;  //same-same but different

    public static void main(String args[]) {

        ConsumerFunctionDemo cfd = new ConsumerFunctionDemo();

//        as it does not apply any process, therefore it accepts.

        cfd.cons.accept("Tushar Kumar is the argument Passed.");
        cfd.cons1.accept("Tushar Kumar is the argument Passed.");
        cfd.cons2.accept("Tushar Kumar is the argument Passed.");

    }

}
