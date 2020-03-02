import java.util.Scanner;

public class newDifferentChacters {
    public static void main(String[] args) {
        System.out.println("Enter a String to extract characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.toUpperCase();
        char arr[] = new char[26];
        for (char ch='A'; ch<'Z';ch++){
            for ( int i=0; i<str2.length();i++){
                if (ch == str2.charAt(i)){
                    if(arr.toString().contains(ch+"")){

                    }
                    else {
                        System.out.print(ch + " ");
                        arr[i] = ch;
                    }
                }
            }
        }
    }

}
