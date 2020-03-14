public class ReplaceAndTrimMethod {
    public static void main(String[] args) {
        // Replace method replaces the all occurrences of the character we want to replace
        System.out.println("Object-Oriented-Programming".replace('m','x')); //Object-Oriented-Prograxxing

        // trim method of the string trims all the leading and the trailing whitespaces

        System.out.println(" My  name is Divyam ".trim());      // My  name is Divyam  --> Without any leading and trailing spaces
        System.out.println(" My  name is Divyam ".length());    // 20
        System.out.println(" My  name is Divyam ".trim().length());  // 18      length after removing the white spaces
    }
}
