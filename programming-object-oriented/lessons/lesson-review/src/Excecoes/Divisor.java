package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int res=0, num, den;
        try {
            System.out.println("Informe o numerador: ");
            num = input.nextInt();

            System.out.println("Informe o denominador: ");
            den = input.nextInt();

            res = (int)(num/den);

        } catch (ArithmeticException err){
            System.out.println("Não é possível dividir por zero");
        } catch (InputMismatchException err){
            System.out.println("Entrada incorreta, forneça inteiros");
            input.nextLine();
        } finally {
            input.close();
        }

        System.out.println("Soma: "+ res);

    }

}
