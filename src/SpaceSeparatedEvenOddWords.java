import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 21/09/2020  -  00:14
 * @project java
 */
public class SpaceSeparatedEvenOddWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] arr = new String[number];
        sc.nextLine();
        for(int i=0; i<number; i++){
            arr[i] = sc.nextLine();
        }


        for(int i=0; i<number; i++){
            String str = arr[i];
            ArrayList<Character> evenChar= new ArrayList();
            ArrayList<Character> oddChar= new ArrayList();
            char[] test = str.toCharArray();
            for(int j=0; j<test.length; j++){
                if(j==0){
                    evenChar.add(test[j]);
                }
                else if(j%2 == 0){
                    evenChar.add(test[j]);
                }
                else if(j%2 !=0){
                    oddChar.add(test[j]);
                }
            }
            String evenStr = convert(evenChar);
            String oddStr = convert(oddChar);
            System.out.println(evenStr+" "+oddStr);
        }

    }
    private static String convert(ArrayList<Character> tt){
        StringBuilder sb = new StringBuilder();
        for (char ch: tt) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
