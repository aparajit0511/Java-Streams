import javapractice.Book;
import javapractice.Magazine;
import javapractice.Novel;
import learnabstract.Flute;
import learnabstract.Guitar;
import learnabstract.Piano;

import learnabstract.Instrument;

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

        // Abstract class
        System.out.println("Abstract methods");

        Piano piano = new Piano();
        piano.play();

        Guitar guitar = new Guitar();
        guitar.play();

        // polymorphism example
        Instrument[] intruments = new Instrument[5];

        intruments[0] = new Piano();
        intruments[1] = new Guitar();
        intruments[2] = new Flute();
        intruments[3] = new Piano();
        intruments[4] = new Flute();

        System.out.println("Checking polymorphism");
        for (Instrument instrument:intruments){
            instrument.play();
        }


    }
}