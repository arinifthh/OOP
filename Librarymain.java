import javax.swing.JOptionPane;
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
        

        StringBuilder intro = new StringBuilder("Welcome to Triple Blue Library System !\n");

        intro.append("\nChoose Your Role");
        
        int role = JOptionPane.showOptionDialog(null, intro.toString(), "Choose Your Role", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Member", "Admin"}, "Member");

        if (role == JOptionPane.YES_OPTION) {
            displayMemberMenu();
        } else if (role == JOptionPane.NO_OPTION) {
            displayAdminMenu();
        }


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
        
        /*a1.addBook(b1);
        m1.borrowBook(b1);
        m1.borrowBook(b2);
        m1.borrowBook(b3);
        m1.displayBorrowingRecord();*/

        
    }

    //maybe kena letak method kat class lain
    public static void displayAdminMenu() {
        Member m1=new Member("M001","Mul","012345678");
        Admin a1=new Admin("A012","Nur");
        String choice;
        choice=JOptionPane.showInputDialog("Menu\n1. Manage Book\n2. Manage Member\n3. Add Announcement");
        //if(choice.equals("1"));
        if (choice.equals("2")) {
            a1.manageMember(m1);
        }
    }

    public static void displayMemberMenu() {
        String choice;
        choice=JOptionPane.showInputDialog("Menu\n1. Search Book\n2. Check Reminder\n3. Borrow Book\n4. Reserve Book\n5. Check Borrowing Record");
        if(choice.equals("1"))
            JOptionPane.showMessageDialog(null, "Display input to put book keyword");
        //else if(choice.equals("2"))
            //m1.displayBorrowingRecord();
    }
}


