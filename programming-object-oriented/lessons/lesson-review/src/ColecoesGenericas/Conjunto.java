package ColecoesGenericas;

import java.util.TreeMap;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();

        conjunto.add("Cinza");
        conjunto.add("Preto");
        conjunto.add("Vermelho");
        conjunto.add("Amarelo");
        conjunto.add("Amarelo");

        System.out.println(conjunto);

        String cor = "Vermelho";

        System.out.println("Cores antes: ");
        System.out.println(conjunto.headSet(cor));

        System.out.println("Cores depois: ");
        System.out.println(conjunto.tailSet(cor));

        System.out.println("Primeiro elemento: ");
        System.out.println(conjunto.first());

        System.out.println("Último elemento: ");
        System.out.println(conjunto.last());
    }
}
