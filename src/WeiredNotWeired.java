import java.util.*;
public class WeiredNotWeired {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 != 0)
            System.out.println("Weird");
        if (N%2 == 0){
            if (1<N && N<6)
                System.out.println("Not Weird");
            else if (5<N && N<21)
                System.out.println("Weird");
            else if (N>20)
                System.out.println("Not Weird");
        }
        scanner.close();
    }
}
