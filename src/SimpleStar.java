import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 24/08/2020  -  09:43
 * @project java
 */
public class SimpleStar {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want in your star pattern");
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());

        System.out.println("Choose the orientation of star pyramid :\n1. Upright \n2. Inverted");
        int orientation = Integer.parseInt(sc.nextLine());
        if (orientation == 1) {
            upright(row);
        } else {
            inverted(row);
        }
    }
    public static void upright(int numberOfRows){
        for (int i = 0; i <numberOfRows ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted(int numberOfRows){
        for (int i = numberOfRows; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
