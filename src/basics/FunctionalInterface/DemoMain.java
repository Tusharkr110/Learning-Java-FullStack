package basics.FunctionalInterface;

import org.w3c.dom.ls.LSOutput;

//functional interface with its annotation
@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface ClassAction{
    void fileSuit();
}


@FunctionalInterface
interface Operation{
    int add(int a, int b);
}

// Lambda exp used to implement functional interface in concise way
// lambda expression Syntax   () -> {}

public class DemoMain {
    public static void main(String args[]) {

//  Exactly one abstract method in Interface
//  java doesn't allow to create object of the functional interface, instead allow me to create an anonymous class

//      Implementing functional interface with anonymous class
        BookAction action = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Using Anonymous class with method called perform(). ");
            }
        };

        action.perform();

//     implementing Lambda Function.
        BookAction  action1 = () -> {
            System.out.println("Tushar Kumar");
        };

        BookAction action2 = () -> System.out.println("in single line");

        action2.perform();

        Operation addition = new Operation(){
            @Override
            public int add(int a, int b){
                return a+b;
            }

        };

        Operation addition2 = Integer::sum;

        Operation addition3 = (x, y) -> { return (x+y); };

        System.out.println(addition.add(234,243));

        System.out.println(addition2.add(3352,25));

        System.out.println(addition3.add(324,23235));
    }
}
