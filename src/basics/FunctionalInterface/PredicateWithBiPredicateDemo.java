package basics.FunctionalInterface;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateWithBiPredicateDemo {

// Predicate :- it accepts one argument and returns boolean value.
// BiPredicate :- it accepts two arguments and returns a single boolean value (true, false).
    public static Predicate<String> isEven = a -> Integer.parseInt(a) %2 ==0;

    public static BiPredicate<String,String > isEquals = (a,b) -> a.equals(b);

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a no. False means Odd no. True means Even no.");
        String str = sc.nextLine();
        System.out.println("Enter Two Statements or Words.");
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(String.format("This is For checking Odd or Even input \n%s  ",isEven.test(str)));
        System.out.println(isEquals.test(a,b));
    }
}
