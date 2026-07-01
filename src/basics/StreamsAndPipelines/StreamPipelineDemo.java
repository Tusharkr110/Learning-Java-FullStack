package basics.StreamsAndPipelines;

/*          STREAM PIPELINES (CHAIN OF OPERATIONS)

 USED FOR SERIES OF EXECUTIONS
 WE WOULD HAVE SEQUENCE OF DATA AND WE PERFORM SOME MODIFICATION AND STORE THEM IN DESIRED FORMAT

* eg: List arrays                SOURCE (WHERE WE CONVERT SOURCE DATA TO STREAM)
*                                   |
* eg: Operations           INTERMEDIATE OPERATIONS
*                                    |
* eg: collection of data     TERMINAL OPERATIONS


 */


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineDemo {
    static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(43);
        numbers.add(2312);
        numbers.add(12);
        numbers.add(245);
        numbers.add(2454);
        numbers.add(28);

//        Basic Understanding using Stream

        Stream<Integer> integerStream = numbers.stream();   //Creating a Stream.

//        Stream<Integer> integerStream1 = integerStream.filter(p);//Creating another Stream for storing even no. using filter (REQUIRE PREDICATE<>)

        Stream<Integer> integerStream1 = integerStream.filter(integ -> integ%2==0); // same as above the difference is we declare explicit predicate and override its test method and here we directly use its implementation(lambda Function)

//      same thing in very concise manner and to store
        List<Integer> evenNo = numbers.stream()
                        .filter(integer-> integer %2 ==0)
                        .collect(Collectors.toList());
        System.out.println(evenNo);



//        Collectors collectors = null;
        List<Integer> evenNumbers = numbers.stream()    //source
                .filter(n -> n%2 ==0 )                  //Intermediate operation (filtering)
                .collect(Collectors.toList());          //Terminal Operations (collecting)

        System.out.println(evenNumbers);
    }


//    PREDICATE 1
//    static Predicate<Integer> p = new Predicate<Integer>() {
//        @Override
//        public boolean test(Integer integer) {
//            int remainder = integer%2;
//            if(0 == remainder){
//                return true;
//            }
//            else
//                return false;
//        }
//    };

    /* PREDICATE 2 Same Predicate with little concise*/

//    static Predicate<Integer> p = integer -> {
//            int remainder = integer%2;
//            if(0 == remainder){
//                return true;
//            }
//            else
//                return false;
//        };


    /* PREDICATE 3 Same Predicate more concise*/
   static Predicate<Integer> p = integer -> integer%2 ==0;
}
