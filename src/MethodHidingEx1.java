class Parent001{
    public static void show(int a, int b){
        System.out.println("Sum from parent is "+(a+b));
    }
}

class child001 extends Parent001{
    public static void show(int a, int b){
        System.out.println("Sum from child method "+(a+b));
    }
}


public class MethodHidingEx1 {
    public static void main(String[] args) {
        Parent001 parent001 = new Parent001();
        parent001.show(10,20);// Calls method sum from parent
        parent001 = new child001(); // parent variable pointing child object
        parent001.show(30,40); // Calls method sum from parent
    }

}
