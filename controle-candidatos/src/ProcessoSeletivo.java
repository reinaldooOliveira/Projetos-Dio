import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        /* analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        selecaoCandidatos();

        imprimirCandidatos();*/

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
               // System.out.println("Contato Realizado com Sucesso");
            }

        } while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos Contato com " + candidato + " na " + tentativasRealizadas + "  tentativa realizada");
        } else {
            System.out.println("Não conseguimos Contato com " + candidato + " na " + tentativasRealizadas + " tentatica  realizada");
        }

    }

    public static void imprimirCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimir Lista de Candidatos informando o indince do elemento ");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O canditado de Nº" + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println(" O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
                "MONICA", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionado < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " solicitou este valor de salário  " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println(" LIGAR PARA CANDIDATO ");
        } else if (salarioBase == salarioPretendido) {
            System.out.println(" LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println(" AGUARDADO O RESULTADO DOS DEMAIS CANDIDATOS ");
        }
    }
}
