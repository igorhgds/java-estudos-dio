package exerciciosBasicos;

import java.text.Format;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] canditados = {"FELIPE", "MARCIA", "LUIZA", "CARLOS", "ANA"};
        for (String candidato : canditados) {
            entrandoEmContato(candidato);
        }

        imprimirSelecionados();
        selecaoCandidatos();

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativas");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        System.out.println("\n");
        String[] candidatos = {"FELIPE", "MARCIA", "LUIZA", "CARLOS", "ANA"};
        System.out.println("Imprimindo a lista de candidatos imformando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("\n");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        System.out.println("\n");
        String [] candidatos = {"FELIPE", "MARCIA", "LUIZA", "CARLOS", "ANA", "PEDRO", "JULIA", "MARCOS", "BEATRIZ", "RAFAEL"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + String.format("%.2f", salarioPretendido));
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado com sucesso!" );
                candidatosSelecionados++;
            }
            candidatoAtual++;
        analizarCandidato(salarioPretendido);
            System.out.println("\n");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
