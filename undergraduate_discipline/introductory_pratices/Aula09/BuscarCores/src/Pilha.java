import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();

        System.out.println(pilha);

        pilha.push(5);
        pilha.push(2.5f);
        pilha.push(3.85d);
        System.out.println(pilha);
    }
}
