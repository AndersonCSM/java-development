package FilaConsultorio;

import java.util.*;

public class FilaConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaP = new LinkedList<>();
        Queue<Paciente> filaN = new LinkedList<>();
        List<Paciente> ordemAtendimento = new ArrayList<>();

        int pacientesChegados = 0;
        int pacientesAtendidos = 0;
        final int tempoConsulta = 5;
        final int qtdAtendimentos = 20;

        // Esta variável é o "cronômetro" do médico
        int tempoConsultaRestante = 0;

        Paciente pacienteEmAtendimento = null;

        System.out.println("--- INÍCIO DO EXPEDIENTE ---\n");
        // O loop simula a passagem dos minutos. Ele só para quando 20 pessoas forem ATENDIDAS
        for (int minuto = 0; pacientesAtendidos < qtdAtendimentos; minuto++) {

            // A cada 4 minutos chega alguém (até o limite de 20 pessoas no dia)
            if (minuto % 4 == 0 && pacientesChegados < qtdAtendimentos) {
                Paciente paciente = NovoPaciente();
                pacientesChegados++;

                if (paciente.getIdade() > 60) {
                    filaP.offer(paciente);
                    System.out.println("[Min " + minuto + "] CHEGADA: " + paciente + " -> Fila PRIORITÁRIA");
                } else {
                    filaN.offer(paciente);
                    System.out.println("[Min " + minuto + "] CHEGADA: " + paciente + " -> Fila NORMAL");
                }
            }

            // REGRA DO CRONÔMETRO DA CONSULTA
            if (tempoConsultaRestante > 0) {
                tempoConsultaRestante--; // O tempo vai passando a cada iteração do loop
            }

            // REGRA DE ATENDIMENTO (O cronômetro zerou, o médico está livre!)
            if (tempoConsultaRestante == 0) {

                // Se o médico estava com alguém, a consulta dessa pessoa acabou de terminar
                if (pacienteEmAtendimento != null) {
                    ordemAtendimento.add(pacienteEmAtendimento); // Guarda no histórico
                    pacientesAtendidos++; // Contabiliza o atendimento feito
                    pacienteEmAtendimento = null; // Libera o médico
                }
                // Se o médico está livre e ainda não bateu a meta de 20 pacientes, chama o próximo
                if (pacientesAtendidos < qtdAtendimentos) {

                    if (!filaP.isEmpty()) {
                        pacienteEmAtendimento = filaP.poll();
                        tempoConsultaRestante = tempoConsulta; // "Seta" o cronômetro para 5 minutos
                        System.out.println("[Min " + minuto + "] INÍCIO DE CONSULTA (Prioridade): " + pacienteEmAtendimento);

                    } else if (!filaN.isEmpty()) {
                        pacienteEmAtendimento = filaN.poll();
                        tempoConsultaRestante = tempoConsulta; // "Seta" o cronômetro para 5 minutos
                        System.out.println("[Min " + minuto + "] INÍCIO DE CONSULTA (Normal): " + pacienteEmAtendimento);
                    }
                }
            }
        }

        System.out.println("\n--- EXPEDIENTE ENCERRADO ---");
        System.out.println("Total de pacientes atendidos: " + ordemAtendimento.size());
        System.out.println("Histórico de Atendimento:");
        for (int i = 0; i < ordemAtendimento.size(); i++) {
            System.out.println((i + 1) + " a ser atendido: " + ordemAtendimento.get(i));
        }
    }

    public static Paciente NovoPaciente() {
        Random random = new Random();
        int idade = random.nextInt(18, 100);
        int RG = random.nextInt(100000000, 999999999);
        return new Paciente(RG, idade);
    }

}
