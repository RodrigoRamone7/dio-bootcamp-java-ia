package functionalInterface.exemples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.forEach(numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        });
    }
}