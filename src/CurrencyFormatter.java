import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Divyam (https://github.com/DevYam)
 * @created 16/09/2020  -  15:34
 * @project java
 */
public class CurrencyFormatter {
    public static void main(String[] args) {
        Double payment = 12324.134;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(payment));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println(nf1.format(payment));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(nf2.format(payment));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(nf3.format(payment));
    }
}
