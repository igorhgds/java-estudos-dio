package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

public class Desafio18 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        // Verifica se todos os elementos da lista são iguais ao primeiro elemento
        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        // Exibe o resultado
        System.out.println("Todos os números são iguais? " + todosIguais);
    }

}
