package PilhaBalanceada;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhaBalanceada {
    public static void main(String[] args) {

        String str1 = "()))";
        String str2 = "(((())))";

        boolean res = balanceado(str1);
        boolean res2 = balanceado(str2);

        System.out.println("String 1 balanceada? "+res);
        System.out.println("String 2 balanceada? "+res2);
    }

    public static boolean balanceado(String cadeia){
        Stack<Character> pilha = new Stack<>();

        boolean value = false;
        char[] arrList = cadeia.toCharArray();

        for (char ch: arrList) {
            if (ch == '(') {
                pilha.push('(');
            } else {
                if (pilha.isEmpty()) { // desbalanceado ) <- ((()))
                    return false;
                }
                else { // ( e ) -> ok
                    pilha.pop();
                }
            }
        }

        return pilha.isEmpty(); // todos os pares ok, return true
    }
}
