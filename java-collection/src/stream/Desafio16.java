package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

public class Desafio16 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        Map<String, List<Integer>> grupos = numeros.stream()
                .distinct()
                .collect(Collectors.groupingBy(n -> { // Agrupa os números conforme os critérios
                    if (n % 2 == 0) return "Números Pares: ";
                    else return "Números Ímpares: :";
                }));

        // Exibe os grupos no console
        grupos.forEach((chave, valores) -> System.out.println(chave + ": " + valores));

    }
}
