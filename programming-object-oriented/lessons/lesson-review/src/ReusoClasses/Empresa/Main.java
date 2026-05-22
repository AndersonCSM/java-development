package ReusoClasses.Empresa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Antonio", 123);
        Pessoa p2 = new Funcionario("Carlos", 124, 2500);
        Pessoa p3 = new ChefeDeDepartamento("Diego", 125, 3000, "DCH");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
