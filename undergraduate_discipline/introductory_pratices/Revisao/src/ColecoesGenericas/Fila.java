package ColecoesGenericas;

import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();

        fila.offer(1d);
        fila.offer(5.24);
        fila.offer(0.5);

        while (!fila.isEmpty()){
            Double n = fila.poll();
            System.out.println(n);
        }
    }
}
