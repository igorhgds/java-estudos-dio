package exerciciosBasicos;

import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] canditados = {"FELIPE", "MARCIA", "LUIZA", "CARLOS", "ANA"};
        for (String candidato : canditados) {
            entrandoEmContato(candidato);
        }
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
}
