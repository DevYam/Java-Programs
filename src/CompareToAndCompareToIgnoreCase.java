public class CompareToAndCompareToIgnoreCase {
    public static void main(String[] args) {
        System.out.println("Ram".compareTo("RAM")); // Returns difference between first unmatched character  => 32
        System.out.println('a'-'A');    // Outputs 32
        System.out.println("Java".compareTo("Object"));     // => -5 == J-5
        System.out.println("Ram".compareToIgnoreCase("RAM"));  //   Outputs to --> 0
    }
}
