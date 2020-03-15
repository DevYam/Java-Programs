public class AdditionSubtractionAndMultiplicationViaCommandLineArguments {
    public static void main(String[] args) {
        // We will be receiving two numbers and a character via command line and performing these operations
        // User should Enter in command line as (first_number Second_Number a/s/m)  -- for addition subtraction and multiplication
        if (args.length == 3) {
            int first = Integer.parseInt(args[0]);
            int Second = Integer.parseInt(args[1]);
            char operation = args[2].charAt(0);


            switch (operation) {
                case 'a':
                    System.out.println("Sum is " + (first + Second));
                    break;
                case 's':
                    System.out.println("Subtraction is " + (first - Second));
                    break;
                case 'm':
                    System.out.println("Multiplication is " + (first * Second));
                    break;
                default:
                    System.out.println("Invalid Argument parameter");

            }
        }else {
            System.out.println("Please Enter CommandLine Arguments correctly");
        }
    }
}
