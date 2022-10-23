import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int i = 1;
        int liczba, suma = 0, min, max;

        Random losowanie = new Random();
        min = losowanie.nextInt(31);
        System.out.println();
        System.out.println("wylosowano liczby: ");


        max = min;
        suma += max;

        do {
            liczba = (losowanie.nextInt(31));
            System.out.print(liczba + " , ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;
            suma += liczba;
            i++;


        }
        while (suma <= 5000);


        {
            System.out.println();
            System.out.println("suma" + suma + ".");
            System.out.println("najw" + max + ",");
            System.out.println("najm" + min + ",");
        }
    }
}






