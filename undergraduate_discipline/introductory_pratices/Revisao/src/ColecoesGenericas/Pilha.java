package ColecoesGenericas;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();

        pilha.push(5);
        pilha.push(2.3);
        pilha.push(1.3747);
        pilha.push(10);
        pilha.push(0);

        while (!pilha.isEmpty()){
            Number n = pilha.pop();
            System.out.println(n);
        }
    }

}
