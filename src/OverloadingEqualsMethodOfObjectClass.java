class Circle1{
    float radius;
    Circle1(float radius){
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }

    // Here we are going to overload the equals method of Object class
    public boolean eeuals(Circle1 circle1){
        if (this.area()==circle1.area()){
            return true;
        }else
            return false;
    }

}

public class OverloadingEqualsMethodOfObjectClass {
    public static void main(String[] args) {
        Circle1 cir1 = new Circle1(3);
        Circle1 cir2 = new Circle1(4);
        Circle1 cir3 = new Circle1(3);

        System.out.println(cir1.eeuals(cir3));
        // Although these objects are pointing to different memory location but this equals comparision returns
        //true because the equals method is overridden and now it checks for area

        System.out.println(cir2.toString());    // Prints name_of_the_class@hashcodeOfTheObject --> Circle1@1b6d3586

        //or we can try simply printing object it will call toString method of the object class implicitly
        System.out.println(cir2);    // Prints name_of_the_class@hashcodeOfTheObject --> Circle1@1b6d3586

    }
}
