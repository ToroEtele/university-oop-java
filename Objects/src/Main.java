public class Main {

    public static void main(String[] args) {
        Book firstBook = new Book();
        Book secondBook = new Book( "Witcher");
        Book thirdBook =  new Book("Game of thrones", 2012);
        Book fourthBook = new Book( "Pál utcai fiúk", new String[]{"Molnár Ferenc", "Pelda String"}, 1906);

        //System.out.println("Information's about the fourthBook: " + fourthBook.toString());

        System.out.println("Title: " + fourthBook.getTitle());
        System.out.println("PubYear: " + fourthBook.getPubYear());
        System.out.println("Author: " + fourthBook.getAuthor());
        String[] authors = fourthBook.getAuthors();
        System.out.print("All authors: ");
        for (int i = 0; i < authors.length; i++)
            System.out.print(authors[i] + " ");
    }
}
