import java.io.*;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 17/09/2020  -  20:37
 * @project java
 */
public class BufferedReaderAndPrintWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\I516379\\IdeaProjects\\java\\src\\randomtext.txt"));
        String Line = br.readLine();
        int sum = 0;
        char arr [] = Line.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            try{
                int n = Integer.parseInt(arr[i]+"");
                sum+=n;
            }catch (Exception e){
            }
        }
        System.out.println(sum);
//        System.out.println(sum);

        //TODO PrintWriter is not working, will have to look into it
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("C:\\Users\\I516379\\IdeaProjects\\java\\src\\randomtext.txt"),true));
        printWriter.println(sum);
    }
}
