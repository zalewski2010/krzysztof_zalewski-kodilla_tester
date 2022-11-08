package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();  // w powyższym kodzie utworzyliśmy zmienną shapes typu List<Square>, a także przypisaliśmy do niej nową, pustą kolekcję w postaci obiektu klasy ArrayList
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (Square square : shapes) {  // uruchamiana petla for-each na kolekcji shapes. W kolejnych iteracjach kolejne elementy z tej kolekcji będą umieszczane w zmiennej square, która jest typu Square (pętlę for-each najwygodniej czyta się od prawej strony do lewej).
            if (square.getArea() > 20) // sprawdzenie warunku, do wnetrza instrucji if trafią tylko te obiekty, których pole powierzchni jest większe niż 20
                System.out.println(square + ", area: " + square.getArea());  // instrukcja if wyświetla wszystkie obiekty o polu powierzchni >20
        }
    }
}
