package functionalInterface.desafios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Collection<Integer> numerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();


        System.out.println(numerosImpares);
    }
}
