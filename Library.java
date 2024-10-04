import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> catalog;
    private List<Member> members;
    private List<Librarian> librarians;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        catalog = new ArrayList<>();
        members = new ArrayList<>();
        librarians = new ArrayList<>();
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void addBookToCatalog(Book book) {
        catalog.add(book);
    }

    public void viewCatalog() {
        System.out.println("Library Catalog:");
        for (Book book : catalog) {
            book.displayBookInfo();
        }
    }
}
