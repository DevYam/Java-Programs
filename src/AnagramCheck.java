import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();


        boolean lengthCheck = false;
        boolean itemCheck = true;

        if (a.length() == b.length()){
            lengthCheck = true;
        }
        char arrA [] = a.toCharArray();
        char arrB [] = b.toCharArray();

        for (int i =0; i<arrA.length; i++){
            for(int j = 1; j<arrA.length-i; j++){
                if(arrA[j-1]>arrA[j]){
                    char temp = arrA[j-1];
                    arrA[j-1] = arrA[j];
                    arrA[j] = temp;
                }
            }
        }

        for (int i =0; i<arrB.length; i++){
            for(int j = 1; j<arrB.length-i; j++){
                if(arrB[j-1]>arrB[j]){
                    char temp = arrB[j-1];
                    arrB[j-1] = arrB[j];
                    arrB[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i]!=arrB[i]){
                itemCheck = false;
            }
        }

        if (lengthCheck && itemCheck){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}