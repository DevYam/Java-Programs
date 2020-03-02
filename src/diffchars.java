import java.util.Scanner;

public class diffchars {
    public static void main(String[] args) {
        System.out.println("Enter a String to count and list different characters");
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String upperStr = Str.toUpperCase();
//        System.out.println("Entered String is "+upperStr);
        int count =0;

        System.out.println("Different Characters used to form this string are : ");
        for(char ch='A';ch<='z';ch++){
            for (int i=0;i< upperStr.length();i++){
                if (ch == upperStr.charAt(i)){
                    count++;
                    System.out.print(ch+" ");
                    break;
                }



            }

        }
        System.out.println("\n Total numbers of characters used is :"+count);

    }
}
