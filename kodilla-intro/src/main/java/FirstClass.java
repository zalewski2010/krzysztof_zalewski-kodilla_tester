import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.weight + " weight " + notebook.price + " price " + notebook.year + " year ");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.weight + " weight " + heavyNotebook.price + " price " + heavyNotebook.year + " year ");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2012);
        System.out.println(oldNotebook.weight + " weight " + oldNotebook.price + " price " + oldNotebook.year + " year ");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

    }

}

