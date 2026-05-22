package ColecoesGenericas;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCor {
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        lista1.add("Azul");
        lista1.add("Preto");
        lista1.add("Branco");
        lista1.add("Roxo");
        lista1.add("Verde");

        lista2.add("Roxo");
        lista2.add("Verde");

        Collections.sort(lista1);

        System.out.println(lista1);

        removeCor(lista1, lista2);

        System.out.println(lista1);

    }

    public static void removeCor(LinkedList l1, LinkedList l2){
        Iterator<String> it = l1.iterator();

        while (it.hasNext()){
            String cor = it.next();
            if (l2.contains(cor)){
                it.remove();
            }
        }
    }
}
