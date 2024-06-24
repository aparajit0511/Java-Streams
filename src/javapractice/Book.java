package javapractice;

public class Book {
    private int isbn;
    private String author;

    private String title;

    private double price;

    public Book(int isbn,String author,String title,double price){
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void displayDetails(){
        System.out.println("The book is titled "+ this.title + " written by " + this.author + " priced at " + this.price + " with isbn number of " + this.isbn);

    }

    public double discountedPrice(double disPrice){
        double dp;
        dp = this.price * (1 - (disPrice/100));
        return dp;
    }
}
