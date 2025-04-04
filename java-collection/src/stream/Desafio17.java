package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

public class Desafio17 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27, 23, 29, 31, 37, 41, 43, 47);

        List<Integer> primos = numeros.stream()
                .distinct()
                .filter(Desafio17::ehPrimo)
                .collect(Collectors.toList());

        System.out.println(primos);
    }


    public static boolean ehPrimo(int numero) {
    if (numero < 2) return false; // Números menores que 2 não são primos
    return IntStream.rangeClosed(2, (int) Math.sqrt(numero)) // Gera um range de 2 até a raiz quadrada do número
            .allMatch(n -> numero % n != 0); // Verifica se o número não é divisível por nenhum valor do range
    }
}
