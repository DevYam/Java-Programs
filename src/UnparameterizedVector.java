import java.util.Vector;

public class UnparameterizedVector {
    // This is an example to demonstrate the working of the un-parameterized vector
    // This takes object as input and  as object is super most class in java this will accept all type of inputs
    // but while retrieving it will return objects only
    public static void main(String[] args) {
        Vector vtr = new Vector(5);  // created an un-parameterized vector
        vtr.add(10.0);            // Although 10 is an integer but it will go in vector as object
        vtr.add(20.0);
        vtr.add(30.0);


        // if we add integers here to vectors then later on we will hav to caste it to Integer only
        // Casting it to double gives exception
        double sum = 0;
        // We are trying to add all the elements that are there in vector

        for(int i = 0; i<vtr.size(); i++){
            sum=sum+(Double) vtr.get(i);        // Here it returns the object which can't be added to double type sum
                                                // So we have type casted it to Double
        }
        System.out.println(sum);        // Output is 60
    }

}
