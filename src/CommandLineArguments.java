public class CommandLineArguments {
    public static void main(String[] args) {
        // All the command line arguments are stored in args array
        // We will have to give arguments after [java filename arguments]
        System.out.println(args.length);
        // java CommandLineArguments 10 Divyam 2 male  // Output -> 4
        // Normal output is 0
    }
}
