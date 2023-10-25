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

/**

1) O que acontece quando é usado um número com mais de cinco dígitos?
    O código roda perfeitamente, pois funciona lendo as 5 primeiras posições informadas de um texto.

2) E com menos de cinco dígitos?
    O código não funciona, pois tenta acessar uma posição fora dos limites do texto.


**/
