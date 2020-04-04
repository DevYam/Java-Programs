class Parent007{
    void show(){
        System.out.println("This is show method of our class");
    }
}

class Child007 extends Parent007{   // Child class
    void show(){    //Overridden Method
        System.out.println("This is show method of child class");
    }
    void display(){ // Not Overridden
        System.out.println("This is display method of child class");
    }
        }
public class OverridingFact {
    public static void main(String[] args) {
        Parent007 p = new Child007();
        p.show();
       // P.display(); // Can't access non overridden method
    }

}
