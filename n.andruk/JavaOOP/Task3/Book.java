package Task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setAuthor("Mykola Andruk");
        title.setTitle("Java");
        content.setContent("Look for book Java");

        author.show();
        title.show();
        content.show();


    }
}
