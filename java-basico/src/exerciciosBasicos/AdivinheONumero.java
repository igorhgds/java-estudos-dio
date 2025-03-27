package exerciciosBasicos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tentativas = 0;
        int chute = 0;
        int numeroSecreto = numeroGerado();
        //System.out.println(numeroSecreto);

        System.out.println("*** JOGO DA ADIVINHAÇÃO ***");
        System.out.println("Descubra o número entre 1 e 50. Com no máximo 5 tentativas!\n");

        while (numeroSecreto != chute && tentativas < 5){
            System.out.println("Digite um numero: ");
            chute = entrada.nextInt();
            tentativas++;
            if (chute == numeroSecreto){
                System.out.println("Parabéns você acertou! com " + tentativas + " tentativas!");
            }else if (chute > numeroSecreto){
                System.out.println("O número secreto é MENOR que " + chute);
            }else {
                System.out.println("O número secreto é MAIOR que " + chute);
            }
        }
        System.out.println("Você perdeu, número de tentativas excedidas: " + tentativas);

        entrada.close();


    }

    static int numeroGerado(){
        return ThreadLocalRandom.current().nextInt(1, 50);
    }
}
