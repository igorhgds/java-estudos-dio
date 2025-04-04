package stream;

import java.util.Arrays;
import java.util.List;

//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

public class Desafio08 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 22, 17);

        int somaDosDigitos = numeros.stream()
                // Passo 1: Converter cada número para String e remover o sinal negativo
                .map(numero -> String.valueOf(numero).replace("-", ""))
                // Passo 2: Quebrar cada número em seus dígitos individuais
                .flatMapToInt(numStr -> numStr.chars().map(Character::getNumericValue))
                // Passo 3: Somar todos os dígitos
                .sum();

        System.out.println(somaDosDigitos);

    }
}
