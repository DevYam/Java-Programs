interface I1{
    void show1();
    void display1();
}

interface I2{
    void show2();
    void display2();
}

public interface InterfaceEx2 extends I1,I2 {
    void show3();
    void display3();
}
class C1 implements InterfaceEx2{
    @Override
    public void show1() {
        System.out.println("Show1");
    }

    @Override
    public void display1() {
        System.out.println("Display1");
    }


    @Override
    public void show2() {
        System.out.println("show2");
    }

    @Override
    public void display2() {
        System.out.println("Display2");
    }

    @Override
    public void show3() {
        System.out.println("show3");
    }

    @Override
    public void display3() {
        System.out.println("Display3");
    }

    public static void main(String[] args) {
        InterfaceEx2 interfaceEx2 = new C1();
        interfaceEx2.show3();
        interfaceEx2.show1();
        interfaceEx2.show2();
        interfaceEx2.display3();
        interfaceEx2.display1();
        interfaceEx2.display2();
    }
}
