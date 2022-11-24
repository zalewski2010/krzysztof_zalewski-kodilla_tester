import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists","USA"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales","Canada"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager","Mexico"));
        users.add(new User("Gus Firing", 49, 0, "Board","USA"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists","Canada"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Board","USA"));
        users.add(new User("Joe Kid", 22, 4, "Board","USA"));

        return users;
    }
}
