package basics.miniProject2;

import java.util.Set;

public class UserDatabase {

    private String name;
    private Set<String> role;
    private boolean activeStatus;

    public UserDatabase(String name, Set<String> role, boolean activeStatus) {
        this.name = name;
        this.role = role;
        this.activeStatus = activeStatus;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRole() {
        return role;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    @Override
    public String toString(){
        return "DatabaseCreation {" +
                "name= '" +name +'\''+
                ", role "+ role+
                ", activeStatus=" + activeStatus +
                '}';
    }
}
