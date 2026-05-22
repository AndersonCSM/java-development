package ReusoClasses.RegistroAcademico;

public class main {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacaoDelegacao reg1;
        RegistroAcademicoPosGraduacaoHeranca reg2;

        reg1 = new RegistroAcademicoPosGraduacaoDelegacao("A metamorfose", "Franz", "Pedro", 2040, "Psicologia");
        reg2 = new RegistroAcademicoPosGraduacaoHeranca("AWS", "Walber", "Isabel", 5020, "BTI");

        System.out.println(reg1);
        System.out.println(reg2);
    }
}
