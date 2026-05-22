public class MediaValores {
    public static void main(String[] args) {
        double m1, m2, m3;
        double[] arr = {1, 2, 4.6};
        double[] arr2 = {0, 1, 2, 4.6};
        double[] arr3 = {1, 2, 4.6, 7, 25.4};

        m1 = media(arr);
        m2 = media(arr2);
        m3 = media(arr3);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public static double media(double... valores){
        double sum = 0;
        for (int i = 0; i < valores.length; i++){
            sum += valores[i];
        }
        return (double)(sum / valores.length);
    }
}
