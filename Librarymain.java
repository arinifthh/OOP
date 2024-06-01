//import javax.swing.JOptionPane;
//nanti ada 3 option, are you admin/member/new member, if new member they will fill details then admin need to accept them, to ensure library safety
// display menu

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) throws Exception {

        ArrayList<Book> borrowList=new ArrayList<>();
        
        //dummy
        Book b1=new Book("Kacau","Ariff Adly","Available");
        Book b2=new Book("Awan","Syafiq Aizat","Available");
        Book b3=new Book("Topeng","Bali Baim","Available");
        Member m1=new Member("M001","Mul","012345678");
        Admin a1=new Admin("A012","Nur");
        

        //both member and admin has menu method
        /*String choice;
        choice=JOptionPane.showInputDialog("Menu\n1. Accept Request New Member\n2. Reject Request new Member");
        if(choice.equals("1"));
        if (choice.equals("1")) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to accept this new member?", choice, JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                
                JOptionPane.showMessageDialog(null, "New member accepted successfully!");
            }
        }*/

        //this after menu
        
        a1.addBook(b1);
        m1.borrowBook(b1);
        m1.borrowBook(b2);
        m1.borrowBook(b3);
        m1.displayBorrowingRecord();

        //a1.manageMember(m1);
    }
}


//still on updating
