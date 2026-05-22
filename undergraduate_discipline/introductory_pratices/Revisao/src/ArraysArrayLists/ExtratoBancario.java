package ArraysArrayLists;

import java.util.Scanner;

public class ExtratoBancario {
    public static void main(String[] args) {
        int opc = 0;
        Double value = 0.0;
        Extrato ext1 = new Extrato();

        Scanner input = new Scanner(System.in);
        while (opc != 4){

            System.out.println(" ");
            System.out.println("Sistema bancário");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - visualizar");
            System.out.println("4 - sair");
            System.out.println(" ");

            opc = input.nextInt();

            switch (opc){
                case 1: {
                    System.out.println("Valor a depositar: ");
                    value = input.nextDouble();
                    ext1.transacao(true, value);
                    break;
                }
                case 2: {
                    System.out.println("Valor a sacar: ");
                    value = input.nextDouble();
                    ext1.transacao(false, value);
                    break;
                }
                case 3: {
                    System.out.println(ext1.toString());
                    break;
                }
                case 4: {
                    System.out.println("Encerrando!");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!, escolha uma opção válida!");
                }
            }
        }

        input.close();
    }
}
