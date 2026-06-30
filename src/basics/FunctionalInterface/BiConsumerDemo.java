package basics.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiConsumerDemo {

    public static BiConsumer<String, Integer> conCat = (a, b) -> {
        System.out.println(String.format("This is concatination of Integer and String %s %s = %s", a, b, (a + b)));
    };


    static void main(String[] args) {

        conCat.accept("6666", 24);


    }
}


