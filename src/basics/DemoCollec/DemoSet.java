package basics.DemoCollec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

    /*
    *
    *  SET
    *
    * Unordered and DO NOT ALLOW DUPLICATE Items also case Sensitive
    * do not have get method
    *
    *
    * ITERATOR
    * It is mainly used when we need more control than just printing like for each loop
    * iterator are also used when we do not know what the data type are.
     */

    public static void main() {
        Set<String> roles = new HashSet<>();

        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");

        roles.add("ADMIN");
        roles.add("admin");

        System.out.println(roles);

        for(String role : roles){
            System.out.println("Role = "+ role);
        }
        //        USING ITTERATOR

        Iterator<String> it = roles.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
