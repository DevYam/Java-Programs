class Parent{
    Parent(){
        System.out.println("This is parent class's constructor");
    }
}
class Child extends Parent{
    Child(){
//        super();      // This call is implicit. Even if we don't write it is going to call parent's constructor
        System.out.println("This is child class's constructor");
    }
}

public class UnparameterizedSuperClassConstructor {
    public static void main(String[] args) {
        Child child = new Child();      // Output - >This is parent class's constructor
                                                    //This is child class's constructor
    }
}
