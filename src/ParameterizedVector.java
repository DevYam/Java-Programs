import java.util.Vector;

public class ParameterizedVector {
    public static void main(String[] args) {
        // This type of vector will only contain one type of values

        Vector <String> vtr = new Vector<>();
        vtr.add("Divyam");
        vtr.add("10");      // Since this is parameterized vector this will only take String (The type specified ) as parameter

        // Giving some other type as parameter will give compile time error

        String str = "";
        for (int i=0; i<vtr.size();i++){
            str = str+vtr.get(i);       // No need to typecast as this is parameterized and returns string only
        }
        System.out.println(str);          // Output -> Divyam10
    }
}
