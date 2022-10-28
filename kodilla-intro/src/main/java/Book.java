public class Book {
    private String author;
            private String title;

private Book(String author, String title) { // konstruktor private,public
    this.author=author;
    this.title=title;
}



    public static Book of(String author, String title) {
        return new Book(author, title);


    }


    public static void main(String[] args) {



    }
}
//return new Book(author, title)