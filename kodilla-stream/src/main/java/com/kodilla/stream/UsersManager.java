package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println("Grupa chemiczna: " + chemistGroupUsernames);
        List<Integer> getAge = filterGetAge();
        System.out.println("Grupa over 40 lat: " + getAge);
        List<String> countryGroupUsernames = filterCountryGroupUsernames();
        System.out.println("Grupa boardów z USA: " + countryGroupUsernames);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }


    private static List<Integer> filterGetAge() {
        List<Integer> getAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>(40))
                .map(UsersManager::getAge)
                .collect(Collectors.toList());

        return getAge;
    }

    private static List<String> filterCountryGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Board"))
                .filter(user -> user.getCountry().equals("USA"))
                .unordered()
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }




    public static int getAge(User user) {
        return user.getAge();
    }

    public static String getUserName(User user) {
        return user.getUsername();

    }
    public static String getGroup(User user) {
        return user.getGroup();
    }
    public static String getCountry(User user){
        return user.getCountry();
    }

}

