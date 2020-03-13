public class GetBytesMethodOfStringClass {
    public static void main(String[] args) {
        byte values[] = "Object".getBytes();       // Corresponding bytes values (Ascii) - > 79 98 106 101 99 116
        for (byte b : values
        ) {
            System.out.print(b + " ");
        }

        byte bytes[] = new byte[10];
        String s1 = "Java";
        bytes = s1.getBytes();
        System.out.println();
        for (byte b1:bytes
             ) {
            System.out.print(b1+" ");  // Output - > 74 97 118 97
        }

    }
}
