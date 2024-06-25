package javapractice;

public class Novel extends Book{

    private boolean novel;
    public Novel(int isbn, String author, String title, double price, boolean novel) {
        super(isbn, author, title, price);
        this.novel = novel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Novel Type is "+ this.novel);
    }
}
