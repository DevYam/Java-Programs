class A1{
     static void sayHi(){
        System.out.println("I am saying Hi"); // Since this method is static this is a class method not an object method

    }
     void saySomething(){
        System.out.println("I am saying something");
    }

}


public class InheritanceBasics extends A1 {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.sayHi();
        A1.sayHi();
        obj.saySomething();
        sayHi();    // If This class does not extends A1 then this function call will give an error
//        saySomething();   // Non static method can't be referenced from a static context
    }

}
