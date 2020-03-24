class AA{

}

public class DoubleEqualToMethod {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        AA a3 = a1;


        // IT checks for objects references if they are pointing to same object then only returns true
        System.out.println(a1==a2); // false
        System.out.println(a1==a3); // true because references are pointing to same object

        // Lets check equals methods from the object class simultaneously

        System.out.println(a1.equals(a2));  //false, checks for the hash code of a1 and a2
        System.out.println(a1.equals(a3));  // true, checks for the hash code of a1 and a3
    }
}
