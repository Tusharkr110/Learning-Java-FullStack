package basics.StreamsAndPipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// USE CASES IF STREAM
/*
* 1. Filtering
* 2. Mapping
* 3. Aggregation: some formula in list or similar data
* 4. Searching
* 5. Iteration
*
 */

public class StreamDemo {

    static void main(String[] args) {
        List<String> items = Arrays.asList("Apple","Banana","Orange","Mango");
        Stream<String> stream1 = items.stream();

        stream1.forEach((item)-> System.out.println(item));

        Stream<String> stream2 = items.stream();
        Stream<String> fil = stream2.filter(name-> name.startsWith("B"));
        fil.forEach((ints)-> System.out.println(ints));

//  IN CONCISE WAY with storing in variable stream3
        Stream<String> stream3 = items.stream();
        stream3.filter((name)->name.startsWith("A")).forEach(System.out::println);

// SAME THING WITHOUT STORING DIRECT DISPLAY
//stream->filter->(startsWith)->Printing
        items.stream()
                .filter((name)->name.startsWith("B")).forEach(System.out::println);

//        Iterator<String > it = items.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());


    }
}
