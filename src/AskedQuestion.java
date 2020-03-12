import java.util.Arrays;

public class AskedQuestion {
    public static void main(String[] args) {
        String str = "aakdshfkjhsd123hg3gg4214hj214141g1jkkjgdjhgs@>,dfds!223(dsjfhf4849dfhks";
       String str1 = str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str1);
        char arr[] = str1.toCharArray();
        Arrays.sort(arr);
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
