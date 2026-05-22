package ArraysArrayLists;

import java.util.ArrayList;

public class Extrato {
    private double saldo;
    private ArrayList<Double> depositos;
    private ArrayList<Double> saques;

    public Extrato() {
        this.saldo = 0;
        this.depositos = new ArrayList<>();
        this.saques = new ArrayList<>();
    }

    public void transacao(boolean depositar, double valor){
        if (valor > 0){
            if (depositar){
                this.saldo += valor;
                this.depositos.add(valor);

                System.out.println("Depósito realizado!");
            } else {
                if ((this.saldo - valor) >= 0){
                    this.saldo -= valor;
                    this.saques.add(valor);

                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Valor solicitado não disponível");
                }

            }
        } else {
            System.out.println("Valor inválido, operação não realizada!");
        }

    }

    @Override
    public String toString() {
        String str = "";
        str += "Saldo atual: "+saldo+"\n";
        str += "Depósitos: \n";
        for (double v: depositos){
            str += "Depósito de R$ "+ v + "\n";
        }
        str += "Saques: \n";
        for (double v: saques){
            str += "Saque de R$ "+ v + "\n";
        }
        return str;
    }
}
