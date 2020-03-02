import java.util.Scanner;

public class countDivisors {
    public static void main(String[] args) {
        System.out.println("Enter a number to count its divisors :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number of divisors are "+count);
    }
}
