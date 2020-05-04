public class multipleExceptions {
    public static void main(String[] args) {
        int a[] = {5,10};
        try {
            int b = Integer.parseInt(args[0]);
            int x = a[b] / (b - a[1]);
            System.out.println(x);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Exception Demo ends");
    }
}
