import java.util.Arrays;

// Implementing Parameterized Comparable Interface
class Box implements Comparable<Box>{
    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    Box(double l, double b, double h){
        length=l;
        width=b;
        height=h;
    }

    public double area(){
        return 2*(length*width+width*height+height*length);
    }


    @Override
    public int compareTo(Box o) {
        return (int)(this.area()-o.area());
    }
}


public class ComparableInterface {
    public static void main(String[] args) {
        System.out.println("I am in main");

        int[] data = {10,-5,56,78,11,89,23};
        String[] names = {"Divyam","abc","bcd","def","ghi"};

        Box [] b = new Box[5];
        b[0] = new Box(10,6,5);
        b[1] = new Box(10,20,5);
        b[2] = new Box(5,20,25);
        b[3] = new Box(40,30,45);
        b[4] = new Box(100,16,8);

        Arrays.sort(data);
        for (int i:data
             ) {
//            System.out.println(i);
        }

        Arrays.sort(names);

        for (String str:names
             ) {
//            System.out.println(str);
        }

        Arrays.sort(b);
        for (Box b1:b
             ) {
            System.out.println(b1.area());
        }

    }
}
