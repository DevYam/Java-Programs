public class CommandLineArguments {
    public static void main(String[] args) {
        // All the command line arguments are stored in args array
        // We will have to give arguments after [java filename arguments]
        System.out.println(args.length);
        // java CommandLineArguments 10 Divyam 2 male  // Output -> 4
        // Normal output is 0
        System.out.println(Integer.parseInt("1324"));
//        System.out.println(Integer.parseInt("10.34"));    Number format exception -> Expected int found double
        System.out.println(Double.parseDouble("10.36"));  // Runs successfully
        
    }
}
