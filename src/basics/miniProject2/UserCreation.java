//    MY METHOD FOR CREATING USER

//package basics.miniProject2;
//
//import java.util.*;
//
//public class UserCreation {

//    private String name;
//    private UserDatabase user;
//
//    public UserCreation(String name){
//        this.name = name;
//
//
////        String names[] = {"A","B","C","D","E","F","G","H","I"};
//
//        // 1. Your starting array of employee roles
//        String options[] = {"Developer","Admin","User","Manager"};
//
//        // 2. Convert array to a list so we can shuffle it
//        List<String> roleList = new ArrayList<>(Arrays.asList(options));
//        Collections.shuffle(roleList);
//
//        // 3. Pick a random size for your final output
//        Random random = new Random();
//
//        // Generates a random number from 1 to the total number of roles
//        int randomSize = random.nextInt(options.length) + 1;
//
//        // 4. Put the shuffled roles into a HashSet to guarantee uniqueness
//        Set<String> uniqueRolesSet = new HashSet<>();
//        for (int i = 0; i < randomSize; i++) {
//            uniqueRolesSet.add(roleList.get(i));
//        }
//
//        UserDatabase userA = new UserDatabase(this.name,uniqueRolesSet, random.nextBoolean());
////        UserDatabase userB = new UserDatabase(names[1],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userC = new UserDatabase(names[2],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userD = new UserDatabase(names[3],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userE = new UserDatabase(names[4],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userF = new UserDatabase(names[5],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userG = new UserDatabase(names[6],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userH = new UserDatabase(names[7],uniqueRolesSet, random.nextBoolean());
////        UserDatabase userI = new UserDatabase(names[8],uniqueRolesSet, random.nextBoolean());
//
//    }
//    @Override
//    public String toString(){
//        return user.toString();
//    }
//
//


//    OOPS METHOD
package basics.miniProject2;

import java.util.*;

    public class UserCreation {

        private final String[] options = {
                "Developer", "Admin", "User", "Manager"
        };

        private final Random random = new Random();

        public UserDatabase createUser(String name) {

            List<String> roleList = new ArrayList<>(Arrays.asList(options));
            Collections.shuffle(roleList);

            int randomSize = random.nextInt(options.length) + 1;

            Set<String> uniqueRoles = new HashSet<>();

            for (int i = 0; i < randomSize; i++) {
                uniqueRoles.add(roleList.get(i));
            }

            return new UserDatabase(
                    name,
                    uniqueRoles,
                    random.nextBoolean()
            );
        }
    }

