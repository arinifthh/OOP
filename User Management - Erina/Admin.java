import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private String adminid;
    private List<Book> managedBooks;

    public Admin(String n,String id) {
        this.name = n;
        this.adminid=id;
        this.managedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAdminId() {
        return adminid;
    }

    public void addBook(Book book) {
        managedBooks.add(book);
    }

    public void removeBook(Book book) {
        managedBooks.remove(book);
    }

    public List<Book> getManagedBooks() {
        return managedBooks;
    }
}
