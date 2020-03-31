class A3{
    protected int a =20;
}
class B3 extends A3{
    private int a =30;
    void show(){
        int a = 50;
        System.out.println(" a = "+a);      // 50
        System.out.println(" a = "+this.a); // 30
        System.out.println(" a = "+super.a);// 20
            }
}

public class SuperEx2 {
    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.show();
    }
}