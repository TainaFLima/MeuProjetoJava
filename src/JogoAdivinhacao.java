import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Gerar o número aleatório
        int numeroAleatorio = new Random().nextInt(101);

        // Inicializar o Scanner
        Scanner scanner = new Scanner(System.in);

        // Informar o início do jogo
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem 5 tentativas.");

        // Variável para controlar as tentativas restantes
        int tentativasRestantes = 5;

        // Loop para as tentativas
        for (int tentativa = 1; tentativa <= 5; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": Digite um número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número aleatório!");
                break; // Sai do loop se acertar
            } else if (numeroDigitado > numeroAleatorio) {
                tentativasRestantes--; // Diminui o contador
                System.out.println("O número é menor. Você tem " + tentativasRestantes + " tentativas restantes.");
            } else {
                tentativasRestantes--; // Diminui o contador
                System.out.println("O número é maior. Você tem " + tentativasRestantes + " tentativas restantes.");
            }

            // Se for a última tentativa
            if (tentativa == 5) {
                System.out.println("Fim de jogo! O número era: " + numeroAleatorio);
            }
        }

        // Fechar o Scanner
        scanner.close();
    }
}
