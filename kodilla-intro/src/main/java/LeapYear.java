import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int rok;

        System.out.println("Podaj rok: ");
        Scanner sc = new Scanner(System.in);
        rok = sc.nextInt();
        if(rok%4==0 && rok%100!=0 || rok%400==0){
            System.out.println("Rok przestępny!");
        }
        else{
            System.out.println("Rok nie przestepny!");
        }

    }

}

