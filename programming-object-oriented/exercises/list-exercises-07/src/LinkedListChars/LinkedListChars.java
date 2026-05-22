package LinkedListChars;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListChars {
    public static void main(String[] args) {
        LinkedList<Character> listaChars = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'h'));
        LinkedList<Character> lista2 = new LinkedList<>();

        ListIterator<Character> iterador = listaChars.listIterator(listaChars.size());
        while (iterador.hasPrevious()){
            char c = iterador.previous();
            lista2.add(c);
        }

        System.out.println(listaChars);
        System.out.println(lista2);
    }

}
