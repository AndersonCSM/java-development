import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();

        cores.add("preto");
        cores.add("azul");
        cores.add("rosa");
        cores.add("laranja");
        cores.add("cinza");
        cores.add("verde");

        cores.add("preto");

        System.out.println(cores);

        System.out.println("Antes da cor preta: "+cores.headSet("preto"));
        System.out.println("Depois da cor preta: "+cores.tailSet("preto"));
        System.out.println("Primeira cor: "+cores.first());
        System.out.println("Ultima cor: "+cores.last());
    }
}
