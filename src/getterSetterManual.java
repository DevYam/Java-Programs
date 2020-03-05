//Access private instance fields of one class in the other class
class Test{
    private int x = 10;
    private double y = 20.07;

    public int getX(){      //This is a getter method which will allow us to access private integer -
                            // x outside the class Test
        return x;
    }
    public double getY(){
        return y;
    }
}

public class getterSetterManual {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("Private x of class Test is = "+obj.getX());
        System.out.println("Private y of class Test is = "+obj.getY());
    }

}
