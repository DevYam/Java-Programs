
public interface InterfaceArea {
    double pi = 3.1456;
    double area();
    double perimeter();
}

interface volume extends InterfaceArea{
    double volume();
}

class Circle123 implements InterfaceArea{
    private double radius;
    Circle123(double radius){
        this.radius = radius;
    }

   public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
       return 2*pi*radius;
    }

    class Box implements volume{

        private double length,breadth,height;
        Box(double l ,double b, double h){
            this.length = l;
            this.breadth = b;
            this.height = h;
        }

        @Override
        public double area() {
            return 2*(length*breadth+breadth*height+height*length);
        }

        @Override
        public double perimeter() {
            return 0;
        }

        @Override
        public double volume() {
            return length*breadth*height;
        }


    }
    public static void main(String[] args) {
        InterfaceArea interfaceArea = new Circle123(4.55);
        System.out.println(interfaceArea.area());
        System.out.println(interfaceArea.perimeter());

    }
}
