public class Exercicio4 {
        public static void main(String[] args) {
            double nota = 7.5;
            verificaNota(nota);
        }

        public static void verificaNota(double nota) {
            if (nota >= 8) {
                System.out.println("Aprovado");
            } else if (nota >= 6) {
                System.out.println("Em recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
