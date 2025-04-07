package EX2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua senha: ");

        String senha = leitor.next();


        if (senha.length() < 8){
            System.out.println("ERRO: senha deve conter pelo menos 8 caracteres");
        } else{
            int quantidadeEspeciais = 0;
            int quantidadeNumeros = 0;
            for(int i = 0; i < senha.length(); i++){
                char c = senha.charAt(i);

                if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)){
                    quantidadeEspeciais++;
                }
                if (Character.isDigit(c)){
                    quantidadeNumeros++;
                }
            }

            if(quantidadeEspeciais > 0){
                if(quantidadeNumeros > 0){
                    System.out.println("Senha cadastrada com sucesso");
                } else{
                    System.out.println("ERRO: senha deve conter pelo menos 1 número");
                }
            } else{
                System.out.println("ERRO: senha deve conter pelo menos 1 caracter especial");
            }

        }
    }
}