package exerciciosBasicos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int operacao = 0;

        System.out.println("*** Qual operação deseja fazer? ***");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Potencia");
        System.out.println("6 - Gerar Tabuada");
        System.out.println("Digite o número da opção: ");
        operacao = entrada.nextInt();

        if (operacao == 6) {
            System.out.println("Quer gerar tabuada de qual número?");
            int numeroTabuada = entrada.nextInt();
            gerarTabuada(numeroTabuada);
        }else {

            System.out.println("Digite um número: ");
            double num1 = entrada.nextInt();
            System.out.println("Digite mais um número: ");
            double num2 = entrada.nextInt();

        switch (operacao) {
            case 1:
                double soma = num1 + num2;
                System.out.printf("Soma: %.2f + %.2f = %.2f", num1, num2, soma);
                break;
            case 2:
                double subtracao = num1 - num2;
                System.out.printf("Subtração: %.2f - %.2f = %.2f ", num1, num2, subtracao);
                break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.printf("Multiplicação: %.2f * %.2f = %.2f ", num1, num2, multiplicacao);
                break;
            case 4:
                double divisao = num1 / num2;
                System.out.printf("Divisão: %.2f * %.2f = %.2f ", num1, num2, divisao );
                break;
            case 5:
                double potencia = Math.pow(num1, num2);
                System.out.printf("Potência de %.2f ^ %.2f = %.2f ", num1, num2, potencia);
                break;
            default:
                System.out.println("Operação não encontrada!");
                break;
        }
        }
    }

    public static int gerarTabuada(int numeroTabuada) {
            System.out.printf("Tabuada do %d \n", numeroTabuada);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", i, numeroTabuada, numeroTabuada * i);
        }
        return numeroTabuada;
    }
}
