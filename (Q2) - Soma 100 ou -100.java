public class q2 {

    public static void main(String[] args) {

        // x,y em [-100,0]
        for (int x = -100, y = 0; x <= 0; x++, y--) {
            int soma = x + y;
            System.out.printf("[%d, %d, %d]\n", x, y, soma);
        }
        // x,y em [0,100]
        for (int x = 100, y = 0; x >= 0; x--, y++) {
            int soma = x + y;
            System.out.printf("[%d, %d, %d]\n", x, y, soma);
        }

    }

}
