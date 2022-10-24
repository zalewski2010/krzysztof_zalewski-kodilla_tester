import java.lang.*;

public class Book2 {
    private String author;
    private String title;


    public Book2(String title, String author)
    {return new Book2(author,title) ;
        String book = Book.of("Isaac Asimov", "The Galaxy");
    }


    public static void main(String[] args) {
        Book2 al = new Book2("Alice in Wonderland", "Lewis Carroll");
        Book2 rt= new Book2("Mary Poppins", "P. J. Travers");


    }
}





