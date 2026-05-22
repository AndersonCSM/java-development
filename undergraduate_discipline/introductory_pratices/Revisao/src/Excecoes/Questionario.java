package Excecoes;

import java.util.TreeMap;

public class Questionario {
    public static void main(String[] args) {
        int[] arr = {0, 1 ,2 ,3 ,14 ,5, 5, 4, 3, 2};
        int[] freq = new int[6];

        for (int v: arr){
            try {
                freq[v]++;
            } catch (ArrayIndexOutOfBoundsException err){
                System.out.println("Valor fora do escopo, não adicionado");
            }

        }

        for (int i=0; i < freq.length; i++){
            System.out.println(i+" : "+freq[i]);
        }

    }
}