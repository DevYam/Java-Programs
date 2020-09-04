/**
 * @author Divyam (https://github.com/DevYam)
 * @created 04/09/2020  -  10:41
 * @project java
 */
public class Lambda1 {
    interface FuncInter1{
        int operation(int a, int b);
    }
    interface FuncInter2{
        void sayMessage(String message);
    }
public static void main(String[] args) {

    /**
     * Normal way of implementing interfaces
     */
//    FuncInter1 fi1 = new FuncInter1() {
//        @Override
//        public int operation(int a, int b) {
//            return a+b;
//        }
//    };
//    System.out.println(fi1.operation(10,20));

    /**
     * Lambda way of implementing interfaces
     */

//    FuncInter1 fi2 = (a, b)->{
//       return a+b;
//    };


    // or

    FuncInter1 fi3 = (a,b)->a+b;

    // or

    /**
     * Using method reference
     */

//    FuncInter1 fi2 = Integer::sum;
//    System.out.println(fi2.operation(10,20));

//    ==================================================================================

    /**
     * Note that lambda expressions can only be used to implement functional interfaces.
     */


    /**
     *  A functional interface in Java is an interface that contains only
     *  a single abstract (unimplemented) method. A functional interface can
     *  contain default and static methods which do have an implementation, in
     *  addition to the single unimplemented method.
     */
    //=============================================================================

}
}
