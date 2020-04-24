import java.util.Arrays;
import java.util.Comparator;

class Box1{
    private double length;
    private double width;
    private double height;


    Box1(double l, double w, double h){
        length=l;
        width=w;
        height=h;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        return 2*(length*width+width*height+height*length);
    }

    public double volume(){
        return length*width*height;
    }
    public String toString(){
        String s1 = "length = "+length;
        String s2 = "Width = "+width;
        String s3 = "Height = "+height;
        String s4 = "Area = "+area();
        String s5 = "Volume = "+volume();
        return s1+s2+s3+s4+s5;
    }
}


class BoxComparisionByLength implements Comparator<Box1> {

    @Override
    public int compare(Box1 o1, Box1 o2) {
        return (int)(o1.getLength()-o2.getLength());
    }
}

class BoxComparisionByArea implements Comparator<Box1>{


    @Override
    public int compare(Box1 o1, Box1 o2) {
        return (int)(o1.area()-o2.area());
    }
}

class BoxComparisionByLengthArea implements Comparator<Box1>{


    @Override
    public int compare(Box1 o1, Box1 o2) {
        if (o1.getLength()==o2.getLength()){
            return (int)(o1.area()-o2.area());
        }
        else {
            return (int)(o1.getLength()-o2.getLength());
        }
    }
}


public class ComparatorInterface {
    public static void main(String[] args) {
        Box1 [] box1s = new Box1[5];
        box1s[0] = new Box1(10,6,5);
        box1s[1] = new Box1(10,20,5);
        box1s[2] = new Box1(5,20,25);
        box1s[3] = new Box1(40,30,45);
        box1s[4] = new Box1(100,16,8);


        Comparator<Box1> bc = new BoxComparisionByLength();
        Arrays.sort(box1s,bc);
        for (Box1 i:box1s
             ) {
            System.out.println(i.getLength());
        }

        System.out.println();
        bc = new BoxComparisionByArea();
        Arrays.sort(box1s,bc);
        for (Box1 i : box1s){
            System.out.println(i.area());
        }
        System.out.println();
        bc = new BoxComparisionByLengthArea();
        Arrays.sort(box1s,bc);
        for (Box1 i : box1s){
            System.out.println(i.area());
            System.out.println(i.getLength());
        }
    }




}
