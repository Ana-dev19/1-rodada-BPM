import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebendo a entrada do usuario
        System.out.print("Digite um número inteiro (0 < N < 13): ");
        int n = input.nextInt();

        // Verificando se a entrada está dentro do intervalo permitido
        if (n < 0 || n > 12) {
            System.out.println("Entrada inválida. O valor de N deve estar entre 0 e 12.");
        } else {
            // Calculando o fatorial
            int fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            // Exibindo o resultado
            System.out.println(n + "! = " + fatorial);
        }

        // Fechando o scanner
        input.close();
    }
}
