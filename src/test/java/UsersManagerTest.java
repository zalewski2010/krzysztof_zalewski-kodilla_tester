import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {

    @Test
    void main() {
    }

    @Test
    void getUserName() {

    }

    @Test
    void filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(toList());


        assertEquals((List.of(new String[]{"Walter White", "Gale Boetticher"})), usernames);

        System.out.println((List.of(new String[]{"Walter White", "Gale Boetticher"})));
        System.out.println(usernames);


    }

    @Test
    void filterChemistGroupUsernames2() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(toList());


        assertEquals((List.of(new String[]{"Wal Whit", "Gal Boett"})), usernames);

        System.out.println((List.of(new String[]{"Wal Whit", "Gal Boett"})));
        System.out.println(usernames);


    }

    @Test
    void filterChemistGroupUsernames3() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Manager"))
                .map(UsersManager::getUserName)
                .collect(toList());


        assertEquals((List.of(new String[]{"Walter White", "Gale Boetticher"})), usernames);

        System.out.println((List.of(new String[]{"Walter White", "Gale Boetticher"})));
        System.out.println(usernames);
    }

    @Test
    void filterGetAge() {

        List<Integer> getAge = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() > (40))
                .map(UsersManager::getAge)
                .collect(toList());


        assertEquals((List.of(new Integer[]{50, 49, 44, 57})), getAge);


    }

    @Override
    public String toString() {
        return "UsersManagerTest{}";
    }

    @Test
    void filterCountryGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Board"))
                .filter(user -> user.getCountry().equals("USA"))
                .unordered()
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        List<String> result = usernames;
        List<String[]> countryGroupUsernames = new ArrayList<>();

        assertEquals(List.of(new String[]{"Gus Firing", "Mike Ehrmantraut", "Joe Kid"}), result);
        System.out.println(result);

    }
}






