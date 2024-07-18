package functionalInterface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMaiorCinco = numeros.stream()
                .filter(numero -> numero > 5)
                .toList();

        double media = (double) numerosMaiorCinco.stream()
                .reduce(0, Integer::sum) / (long) numerosMaiorCinco.size();

        System.out.println("A média dos números maiores que cinco é: " + media);
    }

}
