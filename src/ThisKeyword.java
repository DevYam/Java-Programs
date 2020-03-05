// Here we have a simple example to demonstrate the working of "this" keyword

public class ThisKeyword {
    int a ;
    int b ;
    ThisKeyword( int a, int b){
        this.a = a;
        this.b = b;
        this.display();
    }
    void display(){
        System.out.println(" a is = "+this.a);
        System.out.println(" b is = "+this.b);
    }
}
class DriverClass{
    public static void main(String[] args) {
    ThisKeyword tk = new ThisKeyword(12,17); // This constructor should set the value of all the instance fields
    // and should also call the display method to print the passed values of a and from ye driver class
    }
}
