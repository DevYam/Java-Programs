class A2{
    private int a;
    A2(int a){
        this.a = a;
        System.out.println("This is the constructor of class A2");
    }
    void print(){
        System.out.println(" a is "+a);
    }
    void display(){
        System.out.println("This is the display method of class A2");
    }
}

class B2 extends A2{
    private int b;
    private double c;
    B2(int a, int b, double c){
        super(a);
        this.b = b;
        this.c = c;
        System.out.println("This is the constructor of class B2");
    }
    void show(){
        print();        // a is 10
        super.print();  // a ia 10
        System.out.println(" b = "+b);  // b = 20
        System.out.println(" c = "+c);  // c = 30.33
    }
}


public class SuperEx1 {
    public static void main(String[] args) {
        B2 b2 = new B2(10,20,30.33);
        b2.show();
    }
}
