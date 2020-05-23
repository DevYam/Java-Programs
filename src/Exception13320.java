class CheckedException extends Exception{
    CheckedException(double Dim){
        System.out.println("Invalid Dimension "+Dim);
    }
}

class Box123{
    private double length;
    private double width;
    private double height;

    Box123(double length, double width, double height) throws CheckedException{
        if (length<=0)
            throw new CheckedException(length);
        if (width<=0)
            throw new CheckedException(width);
        if (height<=0)
            throw new CheckedException(height);

        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double area(){
        return 2*(length*width + width*height +height*length);
    }

    public double volume(){
        return length*width*height;
    }

}

public class Exception13320 {
    public static void main(String[] args) {
        try {
            Box123 box123 = new Box123(10,0,20);
            System.out.println(box123.area());

        }catch (CheckedException e){

        }

    }
}
