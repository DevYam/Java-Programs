import java.util.Scanner;

public class elapsedTime {
    // This is a program to calculate the time elapsed while doing any task in a java program
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        double elapsedTime = 0;

        startTime = System.currentTimeMillis();
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println();
        System.out.println("Hi, "+str+"! ");
        System.out.print("Total time elapsed in milliseconds is :");
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime-startTime);
        System.out.print(elapsedTime/100);

    }
}
