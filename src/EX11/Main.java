package EX11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sorteados = new int[6];
        int[] usuario = new int[6];
        int acertos = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            sorteados[i] = random.nextInt(60) + 1;
        }

        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            usuario[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (usuario[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.print("Números sorteados: ");
        for (int num : sorteados) {
            System.out.print(num + " ");
        }

        System.out.println("\nVocê acertou " + acertos + " número(s).");

        scanner.close();
    }
}
