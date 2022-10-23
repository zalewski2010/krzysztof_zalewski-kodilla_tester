import java.sql.SQLOutput;
import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1] obiekt klasy scanner, podłączony do wejścia kompa czyli klawiatury
        while (true) {                                              // [2] pętla wykonuje czynnosci dopóki program nie napotka instrukcji return

            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4] odczytanie danych z klawiatury przy pomocy metody nextline() klasy scanner, trim(usuwa spacje za i przed)
            if (name.length() >= 2) {                              // [5] odczyt tak długo jak wpisze się conajmniej  dwie litery
                return name;                                        // [6] instrukcja return
            }
            System.out.println("Name is too short. Try again.");


        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }

        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int val = scanner.nextInt();
        return val;
    }
}

