import java.util.ArrayList;

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

    public String getConatct(){
        return contact;
    }

    public void borrowBook(Book book) {
        borrowList.add(book);
    }

    public void SearchMember() {

    }
}
