public class LibraryApp {
    private static Library library = new Library();

    public static void main(String[] args) {
        System.out.println(library);
        
        Member.member1 = new Member();
        member1.name = "Mingze Jin";
        member1.birthYear = 2000;
        member1.address = "23 Sycamore Dr";
        
        Address.address1 = new Address();
        address1.street = "Sycamore Dr";
        address1.city = "Markham";
        address1.province = "Ontario";
        address1.postalCode = "L3T 5V3";
    }
}
