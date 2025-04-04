package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

public class Desafio07 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicadas
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1) // Pula o primeiro maior numero
                .findFirst(); // Pega o primeiro número após o maior (ou seja, o segundo maior).

        segundoMaior.ifPresent(num -> System.out.println("O segundo maior número é: " + num));
        //Exibe o resultado no console apenas se um número válido for encontrado.





    }
}
