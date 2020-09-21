/**
 * @author Divyam (https://github.com/DevYam)
 * @created 21/09/2020  -  10:42
 * @project java
 */
public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    static int fact = 1;
    static int factorial(int n){

        if (n==0)
            return 1;

        fact = fact*n;
        n=n-1;

        if (n>0)
            factorial(n);

        return fact;
    }
}
