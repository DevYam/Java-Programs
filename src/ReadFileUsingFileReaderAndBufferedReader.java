import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReaderAndBufferedReader {
    public static void main(String[] args) throws IOException {
        String Line;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\I516379\\Desktop\\new.txt"));
       String line = br.readLine();

        while (line!=null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
