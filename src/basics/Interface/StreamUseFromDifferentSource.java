package basics.Interface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUseFromDifferentSource {

    /*
        From Collection: eg., collection.stream();
        From Arrays: eg., Arrays.stream(array).
        From Specific Values: eg., Stream.of("a","b","c").
        From Functions: eg., Stream.iterate(0, n->n+2).
        From File: eg., Files.lines(path).
        Empty Stream: eg., Stream.empty().

    */

    public static void main(String[] args)  {

//        using List or Collections
        List<Integer> numbers = Arrays.asList(23,523,6775346,3,56,52,34,234,23,423,42,34,25,4,54,2);

        Stream<Integer> inteStream = numbers.stream();
        inteStream.forEach(System.out::println);

//        using arrays
        int[] intArr = {24,23,423,42,34,25,4};

//      USING IntStream instead of Stream<Integer> due to the primitive type of integer.
        IntStream printArray = Arrays.stream(intArr);
        printArray.forEach(System.out::println);

//        using String
        Stream<String> stringStream = Stream.of("a","dsf","sdgs");
        stringStream.forEach(System.out::println);

//        1st element = seed
//        2nd element = f(seed)
//        3rd element = f(f(seed))
//        4th element = f(f(f(seed)))

        Stream.iterate(10, n -> n >= 1, n -> n - 1)
                .forEach(System.out::println);

//        using Function
        Stream<Integer> functionStream = Stream.iterate(1,n -> n*2).limit(10);

        // here limit is the no. of iteration not the value of the program
        //here we iterate from start =1 to n*2, there is no stop condition so it iterates continuously
        functionStream.forEach(System.out::println);


//        using File Path
        try {
            Stream<String > fileStream = Files.lines(Path.of("C:/Users/Tushar Kumar/Desktop/JavaIdea/first-java/src/basics/abc.txt"));
        } catch (IOException e) {
            throw new RuntimeException("Input Output Runtime Exception");
        }



//        using Empty Stream
        Stream<String> emptyStream = Stream.empty();


    }
}

