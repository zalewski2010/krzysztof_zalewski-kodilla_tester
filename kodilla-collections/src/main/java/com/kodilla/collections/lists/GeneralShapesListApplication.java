package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Square square = new Square (10.0);//a. tworzymy obiekt klasy Square  i zapamiętujemy go w zmiennej o nazwie square. Następnie – linijkę niżej – wstawiamy ten obiekt do kolekcji.
        shapes.add(square);
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

        shapes.remove(1); // 1. remove obiekt z kolekcji podając indeks elementu
        shapes.remove(square);  // b. Zmiennej square używamy następnie w linii [b], aby wspomniany kwadrat usunąć z kolekcji.

       Triangle triangle = new Triangle(10.0, 4.0, 10.77); // tworzymy nowy obiekt klasy Triangle, taki sam jak ten, który został utworzony i wstawiony do listy
       shapes.remove(triangle); // wywołujemy metodę remove, przekazując jej jako argument utworzony przed chwilą obiekt.

        System.out.println(shapes.size()); // wyświetlamy rozmiar kolekcji
        for (Shape shape : shapes) {
            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }
    }
}
