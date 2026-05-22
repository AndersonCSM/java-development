import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoverCores {
    public static void main(String[] args) {
        LinkedList<String> cores = new LinkedList<>(Arrays.asList("preto", "azul", "rosa", "laranja", "cinza", "verde"));

        LinkedList<String> remocao = new LinkedList<>(Arrays.asList("azul", "verde"));

        System.out.println(cores);

        removeDaLista(cores, remocao);

        System.out.println(cores);
    }

    public static void removeDaLista(LinkedList<String> listaOriginal, LinkedList<String> listaRemocao){
        Iterator<String> itera = listaOriginal.iterator();
        while(itera.hasNext()){
            String nomeDaCor = itera.next();
            if (listaRemocao.contains(nomeDaCor)){
                itera.remove();
                }
            }
        }
}

