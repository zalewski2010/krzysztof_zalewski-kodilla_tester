package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    void main() {
    }

    @Test
    void getNumberOfPostMinimum40age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() >= (40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(2.25, avg);
    }

    @Test
    void getNumberOfPostMinimum39age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() >= (39))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(2.25, avg);
    }

    @Test
    void getNumberOfPostMinimum41age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() >= (41))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(2.25, avg);
    }

    @Test
    void getNumberOfPostUnder41age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() < (41))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(14.66, avg, 0.1);
    }

    @Test
    void getNumberOfPostUnder40age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() < (40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(14.66, avg, 0.05);
    }

    @Test
    void getNumberOfPostUnder39age() {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() < (39))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        assertEquals(14.66, avg, 0.05);
    }

    }

