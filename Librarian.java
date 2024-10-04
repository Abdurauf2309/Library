import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person {
    private List<Book> managedBooks;

    public Librarian(String name, String ID, int age, String login, String password) {
        super(name, ID, age, login, password, "LIBRARIAN");
        managedBooks = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        managedBooks.add(book);
        System.out.println("Book added: " + title);
    }

    public void removeBook(String bookID) {
        managedBooks.removeIf(book -> book.getBookID().equals(bookID) && book.isAvailable());
    }

    public void issueBook(String bookID, Member member) {
        for (Book book : managedBooks) {
            if (book.getBookID().equals(bookID) && book.isAvailable()) {
                book.borrowBook();
                member.borrowBook(book);
                return;
            }
        }
        System.out.println("Book is not available for issuing.");
    }

    public void returnBook(String bookID) {
        for (Book book : managedBooks) {
            if (book.getBookID().equals(bookID)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found in managed books.");
    }
}
