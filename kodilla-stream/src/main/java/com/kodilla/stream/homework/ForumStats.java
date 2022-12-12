package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= (40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("average posts of users minimum 40 age = " + avg);

        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("average posts of users under 40 age = " + avg1);

    }
}



