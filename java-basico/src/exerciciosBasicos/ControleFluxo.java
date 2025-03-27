package exerciciosBasicos;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();


        try {
            contar(num1, num2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        entrada.close();
    }

    static void contar(int num1, int num2) throws Exception {
        if (num1 > num2) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = num2 - num1;

            for(int i = 1; i <= contagem; ++i) {
                System.out.println("Imprimindo o número " + i);
            }

        }
    }
}

