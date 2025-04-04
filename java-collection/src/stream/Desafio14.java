package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

public class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 17, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::ehPrimo)
                .max(Integer::compare);

        System.out.println("O maior número primo é: " + maiorPrimo.orElse(-1));

    }

    // Metodo auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

//Se um metodo é estático, chamamos ele usando NomeDaClasse::metodo.
//Se um metodo é não estático, precisamos de uma instância para chamá-lo, como objeto::metodo.
//Por isso, no seu código original, chamamos Desafio14::ehPrimo porque o metodo é static e precisa ser referenciado pelo nome da classe.
//Se ainda tiver dúvidas ou quiser aprofundar mais, só avisar! 🚀🔥
