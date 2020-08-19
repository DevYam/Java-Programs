package Lambdas;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 17/08/2020  -  16:18
 * @project java
 */
public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
