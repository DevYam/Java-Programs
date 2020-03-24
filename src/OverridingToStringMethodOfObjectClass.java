class TestClass{
public String toString(){
    return "You are printing overridden toString method";
}
}

public class OverridingToStringMethodOfObjectClass {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
//        System.out.println(obj);    // Without overriding it outputs ->TestClass@1b6d3586 i.e clasname@hashcode
        System.out.println(obj);        // ->You are printing overridden toString method
        // This implicitly converts to  System.out.println(obj.toString); and prints You are printing overridden toString method

    }

}
