package basics.miniProject2;

public class MainClass {

    public static void main(String args[]) {

//        MY METHOD
//        UserCreation userC = new UserCreation("Tushar");

//        System.out.println(userC);

        UserCreation creator = new UserCreation();

        UserDatabase user1 = creator.createUser("Tushar");
        UserDatabase user2 = creator.createUser("Rahul");
        UserDatabase user3 = creator.createUser("Aman");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


    }
}
