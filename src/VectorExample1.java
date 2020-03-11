import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        // Creating an un-parameterized vector
        Vector vtr = new Vector(5);  //This 5 is the capacity of the vector
        System.out.println(vtr.size());     // Initial size is 0 and capacity is 5
        System.out.println(vtr.capacity());

        vtr.add(12);
        vtr.add(13f);
        vtr.add(45.987);
        vtr.add("Divyam");
        vtr.add('c');
        vtr.add("Object");  // Size of the vector increased after adding this String object now size is 10

        System.out.println(vtr.get(3));         // Output -> Divyam
        System.out.println("Size of vector after insertion is "+vtr.size()); // Output -> 6
        System.out.println("Capacity of vector after insertion is "+vtr.capacity()); // Output -> 10

    }
}
