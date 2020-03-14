public class SubstringMethod {
    public static void main(String[] args) {
        String s = "Now is the Time For All Indian";    // 30
        System.out.println(s.length());
        System.out.println(s.substring(30,30)); // No character will be extracted
        System.out.println(s.substring(20,20)); // No character will be extracted
        System.out.println(s.substring(0,2));   // No
        System.out.println(s.substring(11));        // Time for all Indian
    }
}
