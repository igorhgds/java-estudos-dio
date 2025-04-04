package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

public class Desafio10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        Map<String, List<Integer>> grupos = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra apenas números ímpares
                .distinct()
                .filter(n -> n % 3 == 0 || n % 5 == 0) // Filtra múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(n -> { // Agrupa os números conforme os critérios
                    if (n % 3 == 0 && n % 5 == 0) return "Múltiplos de 3 e 5";
                    else if (n % 3 == 0) return "Múltiplos de 3";
                    else return "Múltiplos de 5";
                }));

        // Exibe os grupos no console
        grupos.forEach((chave, valores) -> System.out.println(chave + ": " + valores));
    }
}
