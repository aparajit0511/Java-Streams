import javapractice.Book;
import javapractice.Magazine;
import javapractice.Novel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book = new Book(123456,"Agatha Christie","ABC Murders",222.22);

        book.displayDetails();
        double finalPrice = book.discountedPrice(2.22);
        System.out.println("Final Price after discount is " + finalPrice);

        Magazine magazine = new Magazine(234456,"JK Rowling","Harry Potter",500.00,"Fiction");
        magazine.displayDetails();

        Novel novel = new Novel(12456,"Dan Brown","Deception Point",300.24,true);
        novel.displayDetails();
    }
}