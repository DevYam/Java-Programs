public class EqualsAndEqualsIgnoreCase {
    public static void main(String[] args) {
        System.out.println("abc".equals("Abc")); // returns false
        System.out.println("abc".equals("abc"));    // returns true
        System.out.println("Abc".equalsIgnoreCase("abc"));  //true
        System.out.println("abc".equalsIgnoreCase("ABC"));  //true
    }
}
