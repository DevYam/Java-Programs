
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFileUsingFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\I516379\\Desktop\\new.txt");
        String str = "";
        int ch = fr.read();
        while (ch != -1){
            System.out.print((char)ch);
            ch = fr.read();
            if (ch!=-1)
            str = str+(char)ch;

        }
        String str1 = str.replaceAll("[^A-Za-z]","");

        char arr[] = str1.toCharArray();
        Arrays.sort(arr);
        System.out.println();
        System.out.println(arr);

    }
}
