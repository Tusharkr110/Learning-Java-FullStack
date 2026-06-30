package basics.FunctionalInterface;

import java.util.function.Function;

//FUNCTION interface are the built-in java (Functional interface) which have predefined methods and generics of RETURN TYPE AND INPUTS

//FUNCTION interfaces are in java.util.function.Function package, these are created to implement on the basis of return-type and no. of inputs.
//eg: Function<Return type, Input type> and have only one out-put etc

//function interface is ACTUAL FUNCTIONAL (name = Function) interface but the function-AL interface is a CONCEPT.

public class FunctionInterface {
    public static Function<Integer,Integer> addFunction= (a) -> a+23;
    public static Function<Integer,Integer> subFunction= (a) -> a-232;
    public static Function<Integer,Integer> combinedFunction = addFunction.andThen(subFunction);

    public static void  main(String args[]){
        System.out.println(addFunction.apply(234));
        System.out.println(subFunction.apply(234));

        System.out.println(combinedFunction.apply(3423));

    }
}
