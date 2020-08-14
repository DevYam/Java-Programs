public class TwoDimentionalArrays {
    public static void main(String[] args) {
//        System.out.println("Hi");
        String states[][] = new String[3][2];
        states[0][0] = "State";
        states[0][1] = "Capital";
        states[1][0] = "California";
        states[1][1] = "Sacramento";
        states[2][0] = "Bihar";
        states[2][1] = "Patna";

        for (int i = 0; i <states.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of "+states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
        }

    }
}
