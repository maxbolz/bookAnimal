import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {

        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W. W. Denslow");

        ArrayList<Book> myLibrary = new ArrayList<Book>();
        myLibrary.add(book1);
        myLibrary.add(book2);

        System.out.println("----- Print Book Info -----");
        for(Book b : myLibrary) {
            b.printBookInfo();
            System.out.println("");
        }
        System.out.println("---------------------------\n");

        BookListing listing1 = new BookListing(book1, 10.99);
        BookListing listing2 = new BookListing(book2, 12.99);

        System.out.println("----- Print Description -----");
        listing1.printDescription();
        System.out.println("");
        listing2.printDescription();
        System.out.println("\n-----------------------------");
    }
}



