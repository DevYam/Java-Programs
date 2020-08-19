import java.io.*;
public class test  {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int l=1;
        while((line = br.readLine())!=null){
            String num = Integer.toString(l);
            System.out.println(num+" "+line);
            l++;
        }
    }
}