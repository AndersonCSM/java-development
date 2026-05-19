import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();

        System.out.println(fila);

        fila.offer(5.5);
        fila.offer(3d);
        fila.offer(4.2);
        fila.offer(0.5);

        System.out.println(fila);

        System.out.println("Atendendo: "+fila.poll());
        System.out.println("Atendendo: "+fila.poll());
        System.out.println("Atendendo: "+fila.poll());
        System.out.println("Atendendo: "+fila.poll());
    }

    public static void printQueue(PriorityQueue<Double> fila){
    }
}
