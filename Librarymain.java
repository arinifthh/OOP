public class LibraryMain {
    public static void main(String[] args) throws Exception {
        
        Book b1=new Book("Kacau","Ariff Adly","Available");
        BookInventory bi = new BookInventory(b1);

        bi.addBook(b1);

        
    }
}
//still on updating
