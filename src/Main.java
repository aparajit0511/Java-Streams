import javapractice.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book = new Book(123456,"Agatha Christie","ABC Murders",222.22);

        book.displayDetails();
        double finalPrice = book.discountedPrice(2.22);
        System.out.println("Final Price after discount is " + finalPrice);
    }
}