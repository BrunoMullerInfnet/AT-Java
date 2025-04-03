package EX4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Qual o valor do emprésito?");
        double valor = leitor.nextDouble();

        System.out.println("Qual o número de parcelas?");
        int qntdParcelas = leitor.nextInt();

        if(qntdParcelas < 6 || qntdParcelas > 48){
            System.out.println("O número de parcelas deve ser no mínimo 6 e no máximo 48");
        } else{
            double valorParcela = (valor/qntdParcelas) * 1.03;
            System.out.printf("%s, o valor R$ %.2f vai ser parcelado em %d vezes, sendo R$ %.2f em cada mês (taxa de 3%%)",
                    nome, valor, qntdParcelas, valorParcela);
        }
    }
}
