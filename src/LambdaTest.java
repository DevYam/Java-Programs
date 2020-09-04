import java.util.ArrayList;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 04/09/2020  -  10:19
 * @project java
 */
public class LambdaTest {
    // A java program to implement simple lambada expression

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(14);

        // Using lambada expression
        arr.forEach(n -> System.out.println(n));

        // Using consumer
        arr.forEach(System.out::println);

        //Using lambda to print even
        System.out.println("Now printing only even numbers \n");
        arr.forEach(n ->{
            if (n%2 == 0){
                System.out.println(n);
            }
        });

    }


}
