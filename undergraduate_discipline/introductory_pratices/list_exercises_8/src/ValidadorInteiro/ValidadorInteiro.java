package ValidadorInteiro;

import java.util.Scanner;

public class ValidadorInteiro {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int n1 = obterIntValido();
        int n2 = obterIntValido();

        System.out.println("Soma de inteiros: "+(n1+n2));

        input.close(); // fecha o Scanner
    }

    public static int obterIntValido() {
        boolean error = true;
        int inteiro = 0;

        while (error) {
            try {
                System.out.println("Informe um número inteiro: ");
                inteiro = input.nextInt();

                // Se chegou aqui é um inteiro válido e pode sair do loop
                error = false;
            }
            catch (Exception e) {
                System.out.println("Valor inválido, insira inteiro!");
                input.next(); // limpa buffer
            }
        }
        return inteiro;
    }
}
