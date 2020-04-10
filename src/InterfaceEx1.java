public interface InterfaceEx1 {
    double pi = 3.14;
    void show();
    void display();
}
abstract class Ab implements InterfaceEx1 {

    @Override
    public void show() {
        System.out.println("I am from show");
    }

}
class Abcd extends Ab{
    public void display(){
        System.out.println("I am from display");
    }
    public static void main(String[] args) {
       InterfaceEx1 interfaceEx1 = new Abcd();
       interfaceEx1.display();// I am from show
       interfaceEx1.show();// I am from display
    }


}
