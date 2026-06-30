package basics.MiniProject;

import java.util.Set;

/*
Created user Database with name as private and active status as boolean

we used Set<String> for role as because we have to assign different roles to the same user which are unique.
eg: user1 = "ADMIN", "USER"
user2 = "Manager"
user3 = "USER"


all are unique and can have multiple roles
 */

public class Users {
    private final String name;
    private Set<String> role;       //unique with multiple roles
    private boolean activeStatus;


//  Constructor
    public Users(boolean activeStatus,String name, Set<String> role){

        this.activeStatus=activeStatus;
        this.name=name;
        this.role= role;

    }

//  Getters of each fields of user
    public String getName(){
        return name;
    }


    public Set<String> getRole() {
        return role;
    }

    public boolean isActive(){
        return activeStatus;
    }
}
