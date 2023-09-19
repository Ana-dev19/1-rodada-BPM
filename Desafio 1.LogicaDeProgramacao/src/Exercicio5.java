import java.util.Arrays;
import java.util.Collections;

public class Exercicio5 {


        public static void main(String[] args) {
            Integer[] numeros = {10, 5, 3, 7, 2};
            ordenaDecrescente(numeros);
        }

        public static void ordenaDecrescente(Integer[] numeros) {
            Arrays.sort(numeros, Collections.reverseOrder());
            System.out.println(Arrays.toString(numeros));
        }
    }