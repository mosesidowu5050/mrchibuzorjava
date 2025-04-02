import java.util.Scanner;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Python Guide", "John Doe");
        Book book3 = new Book("C++ Mastery", "Jane Smith", 29.99);

        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
        System.out.println();
        book3.displayBookInfo();
    }
}
