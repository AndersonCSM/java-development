public class Desenho {
    private String nome;
    private FiguraGeometrica f1;
    private FiguraGeometrica f2;
    private int[] coordenadasF1;
    private int[] coordenadasF2;

    public Desenho(String nome, FiguraGeometrica f1, FiguraGeometrica f2, int[] coord1, int[] coord2){
        this.nome = nome;
        this.f1 = f1;
        this.f2 = f2;
        this.coordenadasF1 = coord1;
        this.coordenadasF2 = coord2;
    }

    public void apresenta(){
        System.out.println(this.nome);
        System.out.print("Figura 1: ");
        f1.descricao();
        System.out.println("Posição: "+coordenadasF1[0]+", "+coordenadasF1[1]);

        System.out.print("Figura 2: ");
        f2.descricao();
        System.out.println("Posição: "+coordenadasF2[0]+", "+coordenadasF2[1]);
        System.out.println("");
    }
}
