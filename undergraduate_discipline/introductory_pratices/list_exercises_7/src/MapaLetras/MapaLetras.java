package MapaLetras;

import java.util.TreeMap;

public class MapaLetras {
    public static void main(String[] args) {
        TreeMap<Character, Integer> mapa = new TreeMap<>();

        String palavra = "HELLO THERE";

        char[] arrPalavra = palavra.toCharArray();

        for (char c: arrPalavra){
            char ch = Character.toLowerCase(c);

            if (mapa.containsKey(ch)){
                int qtd = mapa.get(ch);
                mapa.put(ch, qtd +1);
            } else {
                if (ch != ' '){
                    mapa.put(ch, 1);
                }
            }
        }

        System.out.println(mapa);
    }

}
