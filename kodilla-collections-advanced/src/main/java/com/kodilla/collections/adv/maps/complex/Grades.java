package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grades {
    private List<Double> grades = new ArrayList<>();
    public Grades (List<Double> grades) {
        this.grades = grades;



       // Grades johnGrades = new Grades(Arrays.asList(5.0,4.0)); // Klasa Arrays pochodzi z pakietu java.util, a jej metoda asList() tworzy listę, która będzie zawierała przekazane argumenty wejściowe do metody asList().
        // Do tej metody możesz przekazać tyle argumentów wejściowych, ile potrzebujesz.
    }

    public double getAverage() {    // [1] // tworzymy metodę o nazwie getAverage, która będzie zwracała liczbę typu double. Liczbą tą będzie obliczona średnia (dla przypomnienia — wzór na średnią to suma wartości elementów podzielona przez ich liczbę).
        double sum = 0.0;            // [2] // deklarujemy zmienną lokalną metody o nazwie sum, w której będziemy przechowywali wyniki cząstkowe podczas obliczania sumy wartości elementów. Zmienna ta jest typu double i jako wartość początkową przypisujemy do niej zero.
        for (double grade : grades)  // [3] // najduje się deklaracja pętli for-each. Pętla ta iteruje (przebiega) po kolejnych elementach zapisanych w kolekcji grades. Każdy z elementów tej kolekcji jest kolejno pobierany i wstawiany do zmiennej grade (typu double).
            sum += grade;             // [4] // Dla każdego elementu kolekcji wykonywana jest linia [4]. Operator += użyty w tym wyrażeniu to forma skrócona od następującego zapisu: sum = sum + grade;. Wyrażenie to wpisuje do zmiennej sum poprzednią (dotychczasową) wartość zmiennej sum, powiększoną o wartość elementu z kolekcji, który akurat jest przypisany do zmiennej grade. Taki zapis można skrócić do postaci sum += grade;. W kolejnych iteracjach pętli wartość zmiennej sum stale powiększa się o kolejne oceny.
        return sum / grades.size();  // [5] // znajdujemy się już za pętlą, a więc w zmiennej sum znajduje się obliczona suma wartości wszystkich ocen z kolekcji grades. Dzielimy tę sumę przez liczbę ocen, aby obliczyć średnią. Obliczona średnia jest następnie zwracana przy pomocy polecenia return jako wynik działania metody getAverage.
    }

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }

    public List<Double> getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grades grades1)) return false;
        return getGrades().equals(grades1.getGrades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGrades());
    }
}
