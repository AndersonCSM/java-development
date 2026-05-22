import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, den, div = 0;

        try {

        System.out.println("Numerador: ");
        num = input.nextInt();
        System.out.println("Denominador: ");
        den = input.nextInt();

        div = divisao(num, den);
        } catch (InputMismatchException ie){
            System.out.println("Erro no tipo de dado inserido");
            input.nextLine(); // limpa o restante do buffer
        } catch (ArithmeticException ae) {
            System.out.println("Não é possível dividir por zero");
        } finally {
            input.close();
        }

        System.out.println("resultado da divisao do numerado pelo denominador: "+div);

    }

    public static int divisao(int n, int d){
            return n / d;


    }
}
