import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Q2
        Ponto2D ponto1 = new Ponto2D(input.nextInt(),input.nextInt());
        Ponto2D ponto2 = new Ponto2D(input.nextInt(),input.nextInt());
        ponto1.imprimir();
        ponto2.imprimir();


    }

}
