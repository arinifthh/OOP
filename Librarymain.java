//nanti ada 3 option, are you admin/member/new member, if new member they will fill details then admin need to accept them, to ensure library safety
public class LibraryMain {
    public static void main(String[] args) throws Exception {
        
        Book b1=new Book("Kacau","Ariff Adly","Available");
        Member m1=new Member("M001","Mul","012345678");
        Admin a1=new Admin("A012","Nur");
        
        BookManage bi = new BookManage(b1);

        bi.addBook(b1);
        a1.manageMember(m1);
    }
}

//still on updating
