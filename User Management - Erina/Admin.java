import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Admin {
    private String adminID;
    private String adminName;
    private ArrayList<Member> memberList;

    public Admin(String ID,String n) {
        this.adminID=ID;
        this.adminName=n;
        memberList=new ArrayList<>();
    }

    public void manageMember(Member member) {
        String choice;
        choice=JOptionPane.showInputDialog("Choose Operation\n1. Accept Request New Member\n2. Reject Request new Member");
        if(choice.equals("1"));
        if (choice.equals("1")) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to accept this new member?", choice, JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                memberList.add(member);
                JOptionPane.showMessageDialog(null, "New member accepted successfully!");
            }
        }
        else if (choice.equals("2")) {
            JOptionPane.showMessageDialog(null, "New member request rejected.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 1 or 2.");
        }        
    }
}

