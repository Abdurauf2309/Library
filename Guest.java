import java.util.List;

public class Guest extends Person {
    public Guest(String name, String ID, int age) {
        super(name, ID, age, null, null, "GUEST");
    }

    public void viewCatalog(List<Book> catalog) {
        System.out.println("Available Books:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayBookInfo();
            }
        }
    }
}
