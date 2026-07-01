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
import java.util.stream.Collectors;

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

//        Collectors collectors = null;
        List<Integer> evenNumbers = numbers.stream()    //source
                .filter(n -> n%2 ==0 )                  //Intermediate operation (filtering)
                .collect(Collectors.toList());          //Terminal Operations (collecing)

        System.out.println(evenNumbers);
    }
}
