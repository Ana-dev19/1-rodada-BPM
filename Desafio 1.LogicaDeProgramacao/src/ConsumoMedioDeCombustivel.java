import java.util.Scanner;
public class ConsumoMedioDeCombustivel {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Recebendo a entrada do usuario
            System.out.print("Informe a distância total percorrida (em Km): ");
            int distanciaTotal = input.nextInt();

            System.out.print("Informe o total de combustível consumido (em Litros): ");
            double combustivelConsumido = input.nextDouble();

            // Calculando o consumo médio
            double consumoMedio = distanciaTotal / combustivelConsumido;

            // Exibindo o resultado com 3 casas decimais
            System.out.printf("Consumo médio: %.3f km/l\n", consumoMedio);

            // Fechando o scanner
            input.close();
        }
    }