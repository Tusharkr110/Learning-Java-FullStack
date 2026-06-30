package basics.DemoCollec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoMap {

    /* ALL are SET,MAP, List are Interfaces 
     *
     * ArrayList, HashMap, HashSet are the implementations of the corresponding Interfaces
     *
     *  MAP
     *
     * a map cannot contain a duplicate keys and each key must map to atmost one value.
     * but values can be duplicate
     *  Stores Data in [key,value pair]
     *
     *  eg:   [ firstNameKEY : "VALUE" ]
     *
     *
     * forEach loop
     *
     * for(Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
     */

    public static void main() {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1,"Alice");
        userMap.put(2,"Bob");
        userMap.put(3,"Clair");
        userMap.put(4,"Alice");

//        userMap.put(1,"Tushar");
//        No Error but replaces the value of the given "key" to the last updated "value" to "Tushar".

        System.out.println(userMap.entrySet());
        // [1=Alice, 2=Bob, 3=Clair, 4=Alice] output

        for(Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }

//        OUTPUT

            //  1 : Alice
            //  2 : Bob
            //  3 : Clair
            //  4 : Alice


//        USING ITTERATOR

        Iterator<Map.Entry<Integer,String>> it = userMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println("Key = "+ entry.getKey()+", Value = "+ entry.getValue());
        }


    }
}

