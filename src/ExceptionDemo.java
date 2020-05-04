public class ExceptionDemo {
    public static void main(String[] args) {
        int d =0;
        int x= 40;
        try{
        x=42/d;}
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(x);
        System.out.println("Exception Ends");
    }
}
