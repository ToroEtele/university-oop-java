
public class Book {
    private String title;
    private String[] authors;
    private int pubYear;

    private static int numberOfBooks = 0;
    private int bookNr;

    public Book() {
        this("", new String[]{"Unknown"}, -1);
    }
    
    public Book(String title) {
        this( title, new String[]{"Unknown"}, -1);
    }

    public Book(String title, int pubYear) {
        this( title, new String[]{"Unknown"}, pubYear);
    }

    public Book(String title, String[] authors) {
        this( title, authors, -1);
    }

    public Book(String title, String[] authors, int pubYear) {
        this.title = title;
        this.authors = authors;
        this.pubYear = pubYear;
        this.bookNr = numberOfBooks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthor(String author) {
        setAuthors(new String[] { author });
    }

    public String getAuthor() {
        return authors[0];
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getPubYear() {
        return pubYear;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + authors + '\'' +
                ", pubYear=" + pubYear +
                ", bookNr=" + bookNr +
                '}';
    }
}