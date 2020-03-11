public class StringIntro {
    public static void main(String[] args) {
        System.out.println("abc".length());     // Calling String Class's method using string literal instead of string reference
        /* Every string literal in java ( for example "abc", "123", "David" etc ) is a string type object so String class's method can be called using literals */
        String str = new String();
        System.out.println("Str is  ="+str+"Some String");  // Here Str is empty String
        // String can be created from array of characters
        char arr[] = {'d','i','v','y','a','m'};
        String str1 = new String(arr);
        System.out.println(str1); // This will print string "divyam"
        String str2 = new String(arr,2,3);      // (array,offset(Start),count(number of characters));
        System.out.println(str2);       //Outputs -> vya

    }
}
