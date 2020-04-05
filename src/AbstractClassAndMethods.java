// Fact 1 = A class can be declared as abstract even if it does not have any abstract methods

abstract class Abs{
    public void dosomething(int a, int b){
        System.out.println("Sum of a and b is "+(a+b));
    }}

    //Fact 2 = Only instance method can be declared abstract because static and abstract keywords can't be used together

//    public static abstract void dos(int a, int b); //Gives an error as illegal combination of modifiers static and abstract

     class Concrete{
        void cmethod(){
            System.out.println("I am a concrete method");
        }
    }
    abstract class ab2 extends Abs{
        // an abstract class extending other abstract class there is no error
        abstract void dos();    // This is an abstract method
    }
    abstract class ab3 extends Concrete{
    // Here abstract class extending a concrete class
    }

    // If a con concrete class extends an abstract clas then it should provide implementation for all abstract methods otherwise it should also be declared abstract

class NewConcreteClass extends ab2{
    // It must implement abstract method of ab2 or it shall be declared as abstract
    void dos(){
        System.out.println("I am implemented abstract dos method");
    }
}

public class AbstractClassAndMethods {
    public static void main(String[] args) {
        // An instance object cannot be of abstract class type
//        Abs abs =new Abs(); // Gives an error as Abs is abstract; cannot be instantiated
        // However the below statement statement is correct that an
        //abstract class type variable can point to any concrete sub class type instance
        ab2 ab2 = new NewConcreteClass();
        ab2.dos();  // output -> I am implemented abstract dos method
    }
}
