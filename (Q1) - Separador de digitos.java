public class q1 {
    public static void main(String[] args) {
        String number = "17633";
        String output = "";

        for (int i = 0; i < 5; i++) {
            output += number.charAt(i) + "   ";
        }

        System.out.println(output.trim());

    }
}
