/**
 * Address Class
 */
public class Address {

    /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     *
     * street
     * city, province
     * postalCode
     *
     * @return
     *          String consisting of a formatted mailing address.
     */

    String street;
    String city;
    String province;
    String postalCode;

    public static void toString() {
        System.out.println(street);
        System.out.println(city + ", " + province);
        System.out.println(postalCode);
    }
}