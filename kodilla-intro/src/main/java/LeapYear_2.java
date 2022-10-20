public class LeapYear_2 {
    public static void main(String[] args) {
        int rok = 2024;

        System.out.println(rok);

        if (rok%4>0) {
            System.out.println("Rok nie Przestepny");
        } else if (rok%100 != 0) {
            System.out.println("Rok przestepny");
        }
        else if (rok%400==0) {
            System.out.println("Rok Przestepny");
        }
        else
            System.out.println("Rok nie przestepny");
    }

}
