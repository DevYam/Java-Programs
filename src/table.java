import java.util.Scanner;

public class table {
    public static void main(String[] args) {
       printTable();
       askAgain();
    }
    static void printTable() {
        System.out.println("Enter the number to print its table : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Table of " + num + " is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
    static void askAgain(){
        System.out.println("Do you want to print another table - [Y(yes) | N(no)] : ");
        Scanner Scan1 = new Scanner(System.in);
        String choice = Scan1.nextLine();
        if (choice.equals("y")){
            printTable();
            askAgain();
        }
        else if (choice.equals("yes")){
            printTable();
            askAgain();
        }
        else if (choice.equals("Y")){
            printTable();
            askAgain();
        }
        else if (choice.equals("Yes")){
            printTable();
            askAgain();
        }
        else if (choice.equals("No")||choice.equals("N")||choice.equals("no")||choice.equals("n")){
        return;
        }
        else{
            System.out.println("Invalid choice");
            askAgain();
        }
    }
}
