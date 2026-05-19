public class Prova {
    public static void main(String[] args) {
        int resp[] = {0, 1, 2, 3, 4, 5, 14, 5, 5, 2, 0};
        int cont[] = new int[6];

        for (int r: resp) {
            try {
                cont[r]++;
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("A resposta "+r+ " é inválida e não foi considerada.");
            }

        }
        for (int i=0;i < cont.length;i++){
            System.out.println(i + ": "+cont[i]);
        }
    }
}
