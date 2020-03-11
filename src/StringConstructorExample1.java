public class StringConstructorExample1 {
    public static void main(String[] args) {
        // Creating String from String literal
        String str = "abc";     // internally converted to -> String str = new String("abc");
        String str1 = new String("abcdef");     // It says (new String) is redundant
        System.out.println(str1);       // Prints -> abcdef

        // creating String from char[] array
        char arr[] = {'o','b','j','e','c','t'};
        String str2 = new String(arr);
        System.out.println(str2);       // Prints -> object

        String str3 = new String(arr,2,3);
        System.out.println(str3);       // output -> jec

        // Creating string from byte array
        byte bytes[] = {45,65,90,78,23,89};
        String str4 = new String(bytes);
        System.out.println(str4);       // output - >   -AZNY      // It takes ascii values
        String str5 = new String(bytes,2,4);
        System.out.println(str5);   // output - > ZNY
        //String str6 = new String(bytes,3,4);  // java.lang.StringIndexOutOfBoundsException
    }
}
