package basics.MiniProject;

import java.awt.image.ImageProducer;
import java.util.*;

/*
Project Requirements

fetch users from database( we just have to mock the import from database and created our own)

1st   users with unique role and multiple roles can be assigned
2nd   to remove inactive users.
3rd   to List all the active user
4th   Count users as per role
 */
public class UserManagementDemo {

    public static void main() {

//      METHOD 1 of making (Mock) database of user with List[name(String), (Using Set to Store only Unique Roles) roles[], activeStatus(true,false)]

        Set<String> roleUser1 = new HashSet<>(Arrays.asList("ADMIN","USER"));

        Users  user1 = new Users(true,"Tushar", roleUser1 );

        List<Users> users= new ArrayList<>();
        users.add(user1);

//      METHOD 2
        users.add(new Users(true,"Vivek",new HashSet<>(Arrays.asList("MANAGER","USER"))));
        users.add(new Users(false,"Ravikant",new HashSet<>(Arrays.asList("MANAGER"))));
        users.add(new Users(true,"Kartik",new HashSet<>(Arrays.asList("USER"))));



//      REMOVE INACTIVE USERS

        Iterator<Users> it = users.iterator();
        while(it.hasNext()){
            if(!it.next().isActive()){
                it.remove();
            }
        }


//      PRINTING ACTIVE USERS
        System.out.println("ACTIVE USERS");

        for(Users user : users){
            System.out.println(user.getName());
        }

//      COUNTING USERS PER ROLE  (have to map to count as per roles )

        Map<String, Integer> roleCounter = new HashMap<>();


        for (Users user : users){
//      inside user and iterating LIST of Users

            for(String role : user.getRole()){
//          iterating in array of role= KEY by calling getRole

                roleCounter.put(role, roleCounter.getOrDefault(role,0)+1);
//              roleCounter.put(KEY,VALUE) is putting the key value pair in the map

//              and for value roleCounter.getOrDefault( gets the (KEY) role if it exists, or place the default value ) and increases by one

//              eg: (MANAGER = KEY, VALUE =0 (initially) +1)
//              next time it finds manager value increases from 1 -> 1+1=2
            }
        }



        System.out.println("All Roles : Count");

//        iterating map for printing key value pair which we set now

        for(Map.Entry<String, Integer> entry : roleCounter.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }




    }
}
