public class Exercicio2 {
        public static void main(String[] args) {
            int num = -10;
            verificaNumero(num);
        }

        public static void verificaNumero(int num) {
            if (num > 0) {
                System.out.println("O número é positivo");
            } else if (num < 0) {
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é zero");
            }
        }
    }