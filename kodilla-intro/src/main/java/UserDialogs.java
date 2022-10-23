import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1] obiekt klasy scanner, podłączony do wejścia kompa czyli klawiatury
        while (true) {                                            // [2] pętla wykonuje czynnosci dopóki program nie napotka instrukcji return
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4] odczytanie danych z klawiatury przy pomocy metody nextline() klasy scanner, trim(usuwa spacje za i przed)
            if (name.length() >= 2) {                              // [5] odczyt tak długo jak wpisze się conajmniej  dwie litery
                return name;                                        // [6] instrukcja return
            }
            System.out.println("Name is too short. Try again.");
        }
    }
}

