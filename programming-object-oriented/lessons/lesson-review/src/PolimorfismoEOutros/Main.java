package PolimorfismoEOutros;

public class Main {
    public static void main(String[] args) {
        Pagavel fatura = new Fatura(500, 3);
        Pagavel emp = new EmpregadoAssalariado(2500);

        System.out.println(fatura.getPagamento());
        System.out.println(emp.getPagamento());
    }
}
