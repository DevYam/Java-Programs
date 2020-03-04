// This is a simple example to demonstrate working of unparameterized constructor
class sayHello{
    sayHello(){
        System.out.println("Hi There !");
    }
}
public class unparameterizedConstructor {
    public static void main(String[] args) {
        sayHello sh = new sayHello(); // unparameterized constructor is called which prints "Hi There !"
    }

}
