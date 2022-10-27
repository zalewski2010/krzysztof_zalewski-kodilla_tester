package school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {  // stworzenie tablicy z zerową liczbą ocen (czyli nie można jej powiekszyć)
        this.size=0;
        this.values = new int[0];
    }

    public void add(int value) { // metoda tworzy pusta tablice , o jeden większą niż poprzednia+skopiowanie jej elementów+ nowa wartość na koniec
        this.size++; // zwiększa o jeden
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length); // metoda klasy system(kopiuje tablice zródłową do docelowej,zachowując układ elementów)
        newTab[this.size - 1] = value; // przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        this.values = newTab; // przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    }
    public int[] getValues() {
        return values;
    }
    public double getAverage() { // metoda zwracająca średnią ocen
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
    }

