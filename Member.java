import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private List<Book> borrowedBooks;

    public Member(String name, String ID, int age, String login, String password) {
        super(name, ID, age, login, password, "MEMBER");
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 5) {
            if (book.isAvailable()) {
                book.borrowBook();
                borrowedBooks.add(book);
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        } else {
            System.out.println("You can only borrow up to 5 books.");
        }
    }

    public void returnBook(String bookID) {
        for (Book book : borrowedBooks) {
            if (book.getBookID().equals(bookID)) {
                book.returnBook();
                borrowedBooks.remove(book);
                return;
            }
        }
        System.out.println("You haven't borrowed this book.");
    }

    public void viewBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
    }
}
