import javax.swing.*;

interface Abc{
    public void sayHello();
    int ab =220;
}



interface Bcd {
    int a =110;

    // Static method in interfaces can have body and can be called from main using Interface_name.method_name();

    public static void dontSayHello(){
        System.out.println("I am not saying Hello");
    }

    }



public class implimentingInterfaces implements Abc, Bcd {

public void sayHello(){
    System.out.println("Hello");
}



public static void dontSayHello(){
    System.out.println("I am not going to say Hello");
}

    public static void main(String[] args) {
        Abc ab = new Abc() {
            @Override
            public void sayHello() {
                System.out.println("I am saying Hello");
            }
        };
        ab.sayHello();      //  --> I am saying hello
        Bcd.dontSayHello();  // --> I am not saying hello
        implimentingInterfaces im = new implimentingInterfaces();
        im.sayHello();      // --> Hello
        im.dontSayHello();  // --> I am not going to say hello
        System.out.println(Bcd.a); // --> 110 // Data members of an interface can be called can be directly called using their class name
        System.out.println(Abc.ab);   // --> 220 by Interface_name.data_member_name;
        System.out.println(im.ab);   // --> 220 // Can be called using both interface name as well as
        System.out.println(im.a);   // --> 110  // using object of the class

    }

}
