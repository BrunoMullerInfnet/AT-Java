package EX12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mensagens = new String[10];

        // Solicita os nomes dos usuários
        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        // Envio de mensagens alternadas
        for (int i = 0; i < 10; i++) {
            String usuarioAtual = (i % 2 == 0) ? usuario1 : usuario2;
            System.out.print(usuarioAtual + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();
            mensagens[i] = usuarioAtual + ": " + mensagem;
        }

        // Exibe o histórico
        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        // Mensagem final
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
