import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {


        List<String> li = new ArrayList<>();
        /*
        Here <> this is call generic notation or diamond operator
        while using list we must specify the type of the variable
        that we are going to store in the list

        Arraylist is like a growing array
         */
        li.add("Patna");
        li.add("Ranchi");
        li.add("Bengaluru");
        li.add("Lucknow");
        System.out.println(li);

        // Output = [Patna, Ranchi, Bengaluru, Lucknow]
        li.remove(0);
        System.out.println(li);
        /*
        Output = [Ranchi, Bengaluru, Lucknow]
        When we are printing li we are actually calling the toString method on li
            */

        // getting an element from the arraylist
        String state = li.get(1);
        System.out.println("The second state is "+state);

        // Finding an item in the list
        int pos = li.indexOf("Lucknow");
        System.out.println("Lucknow is at position "+pos);

    }
}
