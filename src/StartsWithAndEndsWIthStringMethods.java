public class StartsWithAndEndsWIthStringMethods {
    public static void main(String[] args) {
        System.out.println("Object".startsWith("Obj")); //True
        System.out.println("Object".startsWith("ect",3));       // True |  startsWith(prefix, offset)
        System.out.println("FooBar".endsWith("Bar"));   // True

    }
}
