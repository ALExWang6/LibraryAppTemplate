/**
 * Member class
 */
public class Member {
    String name;
    int birthYear;
    Address address;

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */
    public static int getAge() {
        return 2018 - Member.birthYear;
    }

    /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param book
     *          The book to read.
     */
    public static void readBook(String) {
        System.out.println("I'm reading " + String + "!");
    }
}