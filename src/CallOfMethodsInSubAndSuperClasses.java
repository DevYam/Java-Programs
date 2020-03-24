class class1{
    void call(){
        System.out.println("This is class 1");
    }
}

class class2 extends class1{


}

class class3 extends class2{

}

class class4 extends class3{
//    void call(){
//        System.out.println("This is class 4");
//    }

}





public class CallOfMethodsInSubAndSuperClasses {
    public static void main(String[] args) {
        class4 obj = new class4();
        obj.call(); // This calls method in class 1
        System.out.println(obj.hashCode()); // considers the memory address as hashcode of the object in heap area


    }
}
