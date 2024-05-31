import java.sql.Date;

public class BorrowingRecord {
    private String borrowID;
    private Book book;
    private Member member;
    private Date borrowDate;
    private Date returnDate; //calculate, bole ke guna datatype Date yg tade dalam syllabus?

    public BorrowingRecord(String borID, Book b, Member mem, Date bDate) {
        this.borrowID=borID;
        this.book=b;
        this.member=mem;
        this.borrowDate=bDate;
    }

    //public borrowBook() -this should be in member class

    public void displayBorrowingRecord(){ //display for 1 member & 1 book

    }

    public void displayAllBorrowingRecord(){ //display for All member & All book
        
    }

    //public void searchBook(){ //for bookmanage,when user search, book status appear
        
}
