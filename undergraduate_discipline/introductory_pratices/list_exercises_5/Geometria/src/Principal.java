public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica g1 = new Circulo();
        FiguraGeometrica g2 = new Quadrado();
        FiguraGeometrica g3 = new Triangulo();

        g1.descricao();
        g2.descricao();
        g3.descricao();

        Desenho d1 = new Desenho("Desenho 1",g1, g2, new int[]{1, 1},new int[]{5, 1});
        Desenho d2 = new Desenho("Desenho 2",g2, g3, new int[]{1, 5},new int[]{5, 5});

        d1.apresenta();
        d2.apresenta();

    }
}
