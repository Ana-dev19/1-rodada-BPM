public class Exercicio1 {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            maiorNumero(num1, num2);
        }

        public static void maiorNumero(int num1, int num2) {
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else if (num2 > num1) {
                System.out.println(num2 + " é maior que " + num1);
            } else {
                System.out.println("Os números são iguais");
            }
        }
    }
