package FilaConsultorio;

public class Paciente {
    private int RG;
    private int idade;

    public Paciente(int RG, int idade) {
        this.RG = RG;
        this.idade = idade;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "RG=" + RG +
                ", idade=" + idade +
                '}';
    }
}
