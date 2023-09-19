public class Exercicio3 {
        public static void main(String[] args) {
            char letra = 'a';
            verificaLetra(letra);
        }

        public static void verificaLetra(char letra) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("A letra informada é uma vogal");
            } else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                System.out.println("A letra informada é uma consoante");
            } else {
                System.out.println("O caractere informado não é uma letra");
            }
        }
    }

