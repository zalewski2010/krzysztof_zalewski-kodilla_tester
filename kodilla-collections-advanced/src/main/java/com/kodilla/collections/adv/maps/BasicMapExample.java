package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();  // Zadeklarujemy teraz zmienną o nazwie grades, która będzie mapą o kluczach typu String i wartościach typu Double
        grades.put("Mathematics", 5.0); // dodajmy klika ocen do naszej mapy:
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        Double grade = grades.get("Mathematics"); //  pobieramy z mapy ocenę z matematyki i wyświetlimy ją w konsoli. Aby to zrobić, użyjemy wspomnianej metody get(Object key)
        System.out.println(grade); // została wyświetlona ocena 5.0, która powiązana była z kluczem "Mathematics" w mapie grades.

        for (Map.Entry<String, Double> note : grades.entrySet()) { // pętla for-each, jako zmienna użyte słowo note. metoda ,,entrySet(),, (kolekcja to ,,grades.entrySet(),,
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue()); //  pary klucz-wartość ( getKey()-getValue() )będą wstawiane do zmiennej o nazwie note
        }
        }

    }
