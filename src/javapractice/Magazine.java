package javapractice;

public class Magazine extends Book{

    private String type;

    public Magazine(int isbn,String author,String title,double price,String type){
        super(isbn, author, title, price);
        this.type = type;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
//        System.out.println("The book is titled "+ this.title + " written by " + this.author + " priced at " + this.price + " with isbn number of " + this.isbn);
        System.out.println("Type is " + this.type);
    }
}
