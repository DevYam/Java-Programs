final class Parent2{
    Parent2(int a, int b){
        System.out.println("Value of a is"+a+" value of b is "+b);
    }
}
//class Child2 extends Parent2{ // This gives an error because can't inherit from final class Parent
//    Child2(int a, int b) {
//        super(a, b);
//    }
//
//}

public class NoSubClassesForFinalClass {
}
