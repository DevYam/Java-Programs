package Lambdas;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 17/08/2020  -  16:17
 * @project java
 */
public class Greater {

    public void Greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greater greater = new Greater();
        greater.Greet(helloWorldGreeting);
    }

}
