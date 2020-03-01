import java.util.Scanner;

public class differentCharactersOfString {
    public static void main(String[] args) {
        System.out.println("Enter a string to extract its characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Smaple input "This is a  shitty program"
// Sample output "T h i s   i s   a     s h i t t y   p r o g r a m "
// ;) Don't laugh :)
