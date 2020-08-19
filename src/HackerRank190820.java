import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 19/08/2020  -  10:18
 * @project java
 */
public class HackerRank190820 {
    public static void main(String[] args) throws IOException {
        /**
         * ways to take input from console in java - GFG
         */

        // Reading from console
        /*
        System.out.println("Enter a multiline text");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
         */

        // Reading form file
        /*
        System.out.println("Enter a multiline text");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\I516379\\IdeaProjects\\java\\src\\read.txt"));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
         */

        /**
         * Question -
         * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
         *
         * Hint: Java's Scanner.hasNext() method is helpful for this problem.
         *
         * Input Format
         *
         * Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
         *
         * Output Format
         *
         * For each line, print the line number, followed by a single space, and then the line content received as input.
         *
         * Sample Input
         *
         * Hello world
         * I am a file
         * Read me until end-of-file.
         * Sample Output
         *
         * 1 Hello world
         * 2 I am a file
         * 3 Read me until end-of-file
         *
         */

        // Sol -


//        import java.io.*;
//        import java.util.*;
//
//        public class Solution  {
//
//            public static void main(String[] args) throws IOException {
//                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                String line;
//                int l=1;
//                while((line = br.readLine())!=null){
//                    String num = Integer.toString(l);
//                    System.out.println(num+" "+line);
//                    l = l+1;
//                }
//            }
//        }







    }
}
