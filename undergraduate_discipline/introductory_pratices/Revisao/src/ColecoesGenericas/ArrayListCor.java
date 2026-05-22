package ColecoesGenericas;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCor {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Azul");
        lista.add("Preto");
        lista.add("Branco");
        lista.add("Roxo");
        lista.add("Verde");

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        getCor(lista, "Preto");
    }

    public static void getCor(ArrayList lista, String target){
        if (lista.contains(target)){
            int idx = Collections.binarySearch(lista, target);
            System.out.println("A cor "+target+" está presente na posição "+(idx-1));
        } else {
            System.out.println("A cor"+target+" não está presente na lista");
        }
    }
}
