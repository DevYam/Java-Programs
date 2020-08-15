import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String val1 = getValue("Enter 1st number");
        String val2 = getValue("Enter 2nd Number");
        System.out.println("Choose and operation (+,-,*,/)");
        Scanner sc = new Scanner(System.in);
        String opr = sc.nextLine();

        double result = 0;
        try{
            switch (opr){
                case  "+" :
                    result = addValues(val1, val2);
                    break;
                case  "-" :
                    result = subtractValues(val1, val2);
                    break;
                case "*":
                    result = multiplyValues(val1, val2);
                    break;
                case "/" :
                    result = divideValues(val1, val2);
                    break;
                default:
                    System.out.println("Unrecognised Operation");
                    return;
            }
            System.out.println("The answer is "+result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    private static String getValue(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static double addValues(String s1, String s2){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        return v1+v2;
    }

    private static double subtractValues(String s1, String s2){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        return v1-v2;
    }

    private static double multiplyValues(String s1, String s2){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        return v1*v2;
    }

    private static double divideValues(String s1, String s2){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        return v1/v2;
    }
}
