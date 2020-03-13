public class GetCharsStringMethods {
    public static void main(String[] args) {
        String str = "I am learning java";
        char arr[] = new char[10];
        str.getChars(0,10,arr,0);   // StartIndex, EndIndex,  arr, destinationBegin
        System.out.println(arr);        // Output -> I am learn

    }
}
