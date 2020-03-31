class Parent3{
    int a =20;
    int b=30;
    Parent3(int a,int b){
        System.out.println(" a = "+this.a+" b = "+this.b);  // 20, 30
        System.out.println(" a = "+a+" b = "+b);    // 300, 400

    }
}

class Child3 extends Parent3{
    Child3(int a, int b){
          super(a,b);
        System.out.println(" a = "+a+" b = "+b);    // 300, 400


        System.out.println(" a = "+this.a+" b = "+this.b);  // 20, 30  *****NOTE*****

        System.out.println(" a = "+super.a+" b = "+super.b); // 20, 30
    }
}

public class SecondRoleOfSuper {
    public static void main(String[] args) {
        Child3 obj = new Child3(300,400);
    }
}
