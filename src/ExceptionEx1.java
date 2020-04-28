public class ExceptionEx1 {
    // This is divide by zero exception
    public static void main(String[] args) {
        System.out.println("Hello Exceptions"); // This will be printed
        System.out.println(10/0);
        System.out.println("I seem to have exceptions"); //Since exceptions are caught prior to this this will not be printed
        // These are Un - checked exceptions i.e, not checked by jre where we will have to tell jre to provide default handler or
        // we will have to handle the by ourselves

    }
}
