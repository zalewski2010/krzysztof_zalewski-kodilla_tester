package com.kodilla.optional.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    private List<Student> students;
    private List<String> teacherNames;


    @Test
    void shouldReturnTeacherName() {
        Teacher teacher = new Teacher("Bjorn Earless");
        Student student = new Student("Haydn", teacher);
        assertEquals("Bjorn Earless", teacher.getName());
    }

    @BeforeEach
    public void setUp() {
        teacherNames = new ArrayList<>();
        students = new ArrayList<>();
        {
            students.add(new Student("Chopin", new Teacher("Freddy Musician")));
            students.add(new Student("Mozart", null));
            students.add(new Student("Beethoven", new Teacher("Elvis Songmaker")));
            students.add(new Student("Vivaldi", null));
            students.add(new Student("Bach", null));
            for (Student student : students) {
                Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
                if (optionalTeacher.isEmpty())
                    teacherNames.add(optionalTeacher.orElse(new Teacher("<underfined>")).getName());


            }
        }
    }

    @Test
    public void shouldReturnTeacherNullName() {

        assertEquals("<underfined>", teacherNames.get(0));
        assertEquals("<underfined>", teacherNames.get(1));
        assertEquals("<underfined>", teacherNames.get(2));

        System.out.println(teacherNames);


    }




    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }
}