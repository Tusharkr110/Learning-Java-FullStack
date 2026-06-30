package basics.FunctionalInterface;

//  ::(method reference, it is a shorthand notation which is refer's to a method.
//  it is a part of functional interface.

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
    public static void main(String args[]) {

        List<String> names = Arrays.asList("Tushar","Kumar","Ravi","Kant","Shankar","Gorai");

//      Method 1 to print names
        for(int i = 0; i<names.size();i++){
            System.out.println(names.get(i));
        }

        System.out.println("First Done");


//      Method 2 to print names (enhanced for loop)
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("Second Done");

//      Method 3 to print names (Iterator)
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Third Done");

//      Method 4 to print names (forEach loop)
        names.forEach(new Consumer<String>() {  // here creating a ( FUNCTION )functional interface anonymous class by forEach loop.
            @Override //FUNCTION functional interface which takes one input and returns no output
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("Fourth Done");

//      Method 5 to print names ( similar thing but using lambda function )
        names.forEach((String name)-> System.out.println(name));

        System.out.println("Fifth Done");

//      Method 6 to print names( similar thing using lambda function and infered means automatically detect the data-type as it has only one element.)
        names.forEach((name)-> System.out.println(name));

        System.out.println("Sixth Done");

//      Method 7 (refencing as names has only strings values, we are using forEach, and we know, we cannot perform operation in forEach method, so one thing remains to print the elements of the array
//      so we refer to method println)
        names.forEach(System.out::println);



    }
}
