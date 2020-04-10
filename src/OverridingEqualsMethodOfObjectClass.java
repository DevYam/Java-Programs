class Circle{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    public float getradius(){
        return this.radius;
    }
    public double area(){
        return 3.14*radius*radius;

    }
    public boolean equals(Object object){
        Circle123 c = (Circle123)object;
        if (this.area()==c.area()){
            return true;
        }
        else
            return false;
    }
}

public class OverridingEqualsMethodOfObjectClass {
    public static void main(String[] args) {

        Circle123 cir = new Circle123(3);
        Circle123 cir1 = new Circle123(4);
        Circle123 cir3 = new Circle123(3);
        System.out.println(cir.equals(cir3));   // Although cir and cir3 are pointing to different objects equals returns true because it is overridden and it is looking for area equality
    }
}
