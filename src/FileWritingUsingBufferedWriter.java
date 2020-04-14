import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\I516379\\Desktop\\new.txt",true));
        String towrite = "I am written";
        br.write(towrite);
        br.close();
    }

}
