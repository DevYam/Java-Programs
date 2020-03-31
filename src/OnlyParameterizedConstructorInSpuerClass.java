class Parent1{
    Parent1(int a, int b){
        System.out.println(" a is "+a+" b is "+b);
    }
}

class Child1 extends Parent1{
    Child1(){
        super(10,20);   // not calling super class's constructor gives a compile time error
                                // Because parent class does not have a default constructor
        System.out.println("I am from child1 constructor");
    }
}

public class OnlyParameterizedConstructorInSpuerClass {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();      // Output -  a is 10 b is 20
                                        // I am from child1 constructor
    }
}
