package NomeMeses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NomeMeses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList(
                "janeiro", "fevereiro", "março", "abril",
                "maio", "junho", "julho", "agosto",
                "setembro", "outubro", "novembro", "dezembro"));

        boolean error = true;
        int choice = 0;

        while(error){
            try {
                System.out.println("Informe um inteiro entre 1 e 12 para obter o nome do mês ");
                choice = input.nextInt();

                if ((choice > 0) && (choice <= 12)) {
                    error = false;
                }
            } catch (Exception e) {
                    System.out.println("Valor inválido, insira novamente!");
                    input.next(); // limpa buffer
                }
            }

        String mes = nomes.get(choice-1);
        System.out.println("Mês informado: "+mes);

        input.close();
    }
}
