public class q3 {
    public static void main(String[] args) {
        int total, resto, notas100, notas50, notas10, notas5, notas1;

        total = 399;

        notas100 = total / 100;
        resto = total % 100;

        notas50 = resto / 50;
        resto = resto % 50;

        notas10 = resto / 10;
        resto = resto % 10;

        notas5 = resto / 5;
        resto = resto % 5;

        notas1 = resto;

        System.out.println(total);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

    }
}
