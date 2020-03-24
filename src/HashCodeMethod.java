class A{

}
public class HashCodeMethod {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;

        System.out.println(a1.hashCode());      // hashcode for a1 and a3 is same as they are pointing to same memory location  460141958
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());      // 460141958

        System.out.println(a1.equals(a3));      // True     Because hashcode value of a1 and a3 are same
        System.out.println(a1.equals(a2));      // False    Because Hashcode not same // Changes
    }
}
