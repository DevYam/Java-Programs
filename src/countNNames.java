import java.util.Scanner;

public class countNNames {
    // This is a program to count total number of names entered
    public static void main(String[] args) {
        System.out.println("You can enter a few names separated by space I will count how many names you have entered :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        System.out.println("Total number of names entered is "+arr.length);
        System.out.println("These are - ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
