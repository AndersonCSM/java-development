package ArraysArrayLists;

public class TrianguloPascal {
    public static void main(String[] args) {
        int linhas = 5;
        int col;

        int[][] triangulo = new int[linhas][];

        for(int i = 0; i < linhas; i++){
            col = i + 2;
            triangulo[i] = new int[col];

            triangulo[i][0] = 1;
            triangulo[i][col-1] = 1;

            for(int j = 1; j < (col - 1); j++){
                triangulo[i][j] = triangulo[i-1][j] + triangulo[i-1][j-1];
            }
        }

        for(int i = 0; i < triangulo.length; i++){
            for(int j = 0; j < triangulo[i].length; j++){
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
