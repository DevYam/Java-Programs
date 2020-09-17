import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 16/09/2020  -  17:26
 * @project java
 */
public class Bsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr);

    }
}
