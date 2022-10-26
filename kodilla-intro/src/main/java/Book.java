public class Book {
    private String author;
            private String title;



    public String book = Book.of("Isaac Asimov ", " The Galaxy");

    static String of(String author, String title) {
    return author+title;
    }


    public static void main(String[] args) {



    }
}
//return new Book(author, title)