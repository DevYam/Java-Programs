public class ExceptionEx2 {
    // This will be a null pointer exception
    // This is an unchecked exception i.e, it will not be checked by jre we will have to handle ourselves or tell jre to handle
    public static void main(String[] args) {
        System.out.println("Hello exception");  // Printed
        String str = null;
        System.out.println(str.equals("java"));// Null pointer exception
        System.out.println("I will not be printed");    // null pointer exception
    }
}
