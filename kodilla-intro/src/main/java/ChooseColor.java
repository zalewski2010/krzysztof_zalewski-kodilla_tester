import java.util.Scanner;
public class ChooseColor {
        public static void main(String[] args) {
            String result = ChooseColor.getUserSelection();
            System.out.println(result);
        }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Please write first letter of your favourite color (for example type c like czarny) :");
            String getUserSelection = scanner.nextLine().trim().toUpperCase();
            switch (getUserSelection) {
                case "C":
                    return "Czarny lub Czerwony to dobry wybór";
                case "B":
                    return "Biały";
                case "P":
                    return "Pomarańczowy";
                case "F":
                    return "Fioletowy";
                case "A":
                    return "Antracyt";
                case "G":
                    return "Granatowy";
                case "I":
                    return "Indygo";
                default:
                    System.out.println("Nietypowy gust. Try again.");
            }
        }
    }
}
