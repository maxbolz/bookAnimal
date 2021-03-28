public class BookListing {

    private Book myBook;
    private double price;

    public BookListing(Book b, double p) {
        myBook = b;
        price = p;
    }

    public void printDescription() {
        myBook.printBookInfo();
        System.out.print(", $" + price);
    }
}
