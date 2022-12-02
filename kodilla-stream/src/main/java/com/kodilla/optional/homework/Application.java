package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        {
            students.add(new Student("Chopin", new Teacher("Freddy Musician")));
            students.add(new Student("Mozart", null));
            students.add(new Student("Beethoven", new Teacher("Elvis Songmaker")));
            students.add(new Student("Vivaldi", null));

            for (Student student : students) {
                Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
                String teachername =
                            optionalTeacher.orElse(new Teacher("<underfined>")).getName();



                System.out.println("student: " +(student.getName()) +", mistrz: "+ teachername);


            }
        }
    }




}
