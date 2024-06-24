package javapractice;

public class Magazine extends Book{
    public Magazine(int isbn, String author, String title, double price) {
        super(isbn, author, title, price);
        super.displayDetails();
    }


}
