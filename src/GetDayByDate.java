import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 16/09/2020  -  12:56
 * @project java
 */

// Expected input format = 16/09/2020
public class GetDayByDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc =  new Scanner(System.in);
        String dateGiven = sc.nextLine();
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateGiven);
        DateFormat df = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        System.out.println(df.format(date));
    }
}
