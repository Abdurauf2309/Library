
public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.bookID = BookIDGenerator.generateBookID(); // Use the BookIDGenerator to generate the ID
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public String getBookID() {
        return bookID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
