package com.kodilla.school;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.Grades;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {

    @Test
    public void shouldHaveZeroLength() { //weryfikuje, czy w nowym obiekcie Grades tablica z ocenami jest pusta
        Grades grades = new Grades();
        int[] values = grades.getValues();
        Assertions.assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() { // sprawdza, czy po dodaniu dwóch ocen tablica ma odpowiedni rozmiar oraz czy znajdują się w niej dodane wartości.
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        Assertions.assertEquals(2, values.length);
        Assertions.assertEquals(4, values[0]);
        Assertions.assertEquals(2, values[1]);
    }
    @Test
    public void shouldCalculateAverage() { //test na srednia ocen
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }

}