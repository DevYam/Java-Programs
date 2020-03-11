import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector vtr = new Vector(20);        //initialCapacity = 20 is the initial capacity, after filling the 20 elements
                                                        // initialCapacity will become 2*20 = 40 (before filling 21st element)
        vtr.add(20);
        System.out.println(vtr.get(0));
        System.out.println(vtr.size());  // Size of vtr is still 1 because only one element is there

        int arr[] = new int[20];
        System.out.println(arr.length); // note here, size is method in vector and length is property of array

        // Size of vector is 1 and length of array is 20


    }
}
