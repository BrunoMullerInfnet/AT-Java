package EX10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Cadastre 3 compras");

        Scanner leitor = new Scanner(System.in);
        FileWriter arq = new FileWriter("./src/EX10/compras.txt");

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do produto: ");
            String nome = leitor.nextLine();
            System.out.println("Digite a quantidade: ");
            int quantidade = leitor.nextInt();
            System.out.println("Digite o valor do produto: ");
            double valor = leitor.nextDouble();
            leitor.nextLine(); // limpa o buffer
            arq.write("Produto: " + nome + ", Quantidade: " + quantidade + ", Valor: " + valor + "\n");
        }

        arq.close();
        leitor.close();

        BufferedReader leitorArq = new BufferedReader(new FileReader("./src/EX10/compras.txt"));
        String linha;

        System.out.println("\nCompras registradas:");
        while ((linha = leitorArq.readLine()) != null) {
            System.out.println(linha);
        }

        leitorArq.close();
    }
}
