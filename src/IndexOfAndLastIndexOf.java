public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        String s = "Now is the Time For All Indians";
        s = s+"to come to the aid og India";

        System.out.println(s.indexOf("x")); //output -> -1
        System.out.println(s.indexOf("a")); //output -> 28
        System.out.println(s.lastIndexOf("a"));  //output -> 57
        System.out.println(s.indexOf("Ind"));   // 24
        System.out.println(s.lastIndexOf("Ind")); // 53
        System.out.println(s.indexOf("Ind",30)); // 52


    }
}
