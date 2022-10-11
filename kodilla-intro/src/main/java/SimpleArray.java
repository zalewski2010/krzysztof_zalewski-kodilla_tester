public class SimpleArray {
    public static void main (String [] args) {
        String[] cars = new String[5];
        cars [0] = "Mercedes";
        cars [1] = "BMW";
        cars [2] = "Volvo";
        cars [3] = "Audi";
        cars [4] = "Toyota";
        String car = cars[3];
        System.out.println (car);
        int numberOfElements = cars.length;
        if (numberOfElements > 4 ){
            System.out.println ("Moja tablica zawiera");
            System.out.println (numberOfElements);
            System.out.println ("elementów");}



    }
}
