
public class StringComparision {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = new String("abc");    //This will create a new String object in heap
        String str2 = "abc"; // This will point to the same object that str points to

        if (str.equals(str1)){      // Checks the values --> Checks state of two strings references
            System.out.println(".equals is true");
        }
        if (str == str1){      // Returns true if both the string references are pointing to same object --> Same location in heap
            System.out.println(" == is true");  // Returns false because str1 is created using new operator which creates a separate object in heap
        }
        if (str == str2)
            System.out.println(" == true in 2nd case");     // This returns true because str and str2 points to the same object in heap

        if("def" == "def"){
            System.out.println("Equality on liters hold");
        }


    }
}
