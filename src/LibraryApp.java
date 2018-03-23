public class LibraryApp {
    private static Library library = new Library();

    public static void main(String[] args) {
        System.out.println(library);
        
        Member.member1 = new Member();
        member1.name = "Mingze Jin";
        member1.birthYear = 2000;
        member1.address = "23 Sycamore Dr";
        
    }
}
