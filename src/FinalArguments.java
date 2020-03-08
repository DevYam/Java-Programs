public class FinalArguments {
    // This is a class where the method below has a final type of argument
    public static void sum(final int a, int b){
//     a=50;     // Writing this gives a compile time error -> final parameter can not be changed
        System.out.println("Sum is "+(a+b));
    }

    public static void main(String[] args) {
        sum(10,20);
    }
}
