import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Member {
    private String memberID;
    private String name;
    private String contact;
    private ArrayList<Book> borrowList;

    public Member(String mID,String n, String con) {
        this.name=n;
        this.memberID=mID;
        this.contact=con;
        borrowList=new ArrayList<>();
    }

    public String getMemberID(){
        return memberID;
    }

    public String getName(){
        return name;
    }

    public String getContact(){
        return contact;
    }

    public void borrowBook(Book book) {
        borrowList.add(book); 
        book.setStatus("Borrowed");
    }

    public void requestBook(Book book) {

    }

    public void SearchMember() {

    }
    
    public void displayBorrowingRecord() {
        StringBuilder recordDisplay = new StringBuilder("Borrowing Records For " + name + "\n");

        for (Book brList : borrowList) {
            recordDisplay.append("\n- ").append(brList.getTitle());
        }

        JOptionPane.showMessageDialog(null, recordDisplay.toString());
    }
}
