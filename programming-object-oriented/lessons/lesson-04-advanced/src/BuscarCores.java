import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuscarCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("azul");
        cores.add("rosa");
        cores.add("laranja");
        cores.add("cinza");
        cores.add("verde");

        System.out.println(cores);

        Collections.sort(cores);

        System.out.println(cores);

        buscarCor(cores, "cinza");
        buscarCor(cores, "roxo");

    }

    public static void buscarCor(ArrayList<String> lista, String alvo){
        if (lista.contains(alvo)){
            int posicao = Collections.binarySearch(lista, alvo);
            System.out.println(alvo + " esta na posicao "+(posicao+1)+" da lista");
        } else {
            System.out.println("alvo não está na lista");
        }
    }
}
