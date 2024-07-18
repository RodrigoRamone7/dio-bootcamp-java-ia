package functionalInterface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros
                .stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        int resultado = numerosPares
                .stream()
                .reduce(0, Integer::sum);

        System.out.println("O resultado da soma dos números pares é: " + resultado);
    }
}
