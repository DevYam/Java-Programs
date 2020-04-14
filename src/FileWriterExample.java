import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\I516379\\Desktop\\new.txt");
        String content = "This is written using java";
            fw.write(content);
        fw.close();
    }
}
