public class TermosSerie {
    public static void main(String[] args) {
        final int qtdNumeros = 1000000;
        double[] arraySerie = new double[qtdNumeros];



        calculaEMostraSomatoria(arraySerie);

    }

    public static void calculaEMostraSomatoria(double[] arr){
        // Série de pi²/6
        double val = 0;
        int c = 10;
        for (int i = 1; i <= arr.length; i++){
            val += (double) (1 /Math.pow(i, 2));
            arr[i-1] = val;

            if (((i-1) % c) == 0){
                System.out.println(arr[i-1]);
                c *= 10;
            }
        }
    }


}
