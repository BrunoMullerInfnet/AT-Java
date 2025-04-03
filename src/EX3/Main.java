package EX3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o seu salário mensal");
        double salario = leitor.nextDouble();

        double imposto = 0;
        double salarioLiquido = 0;

        if (salario <= 22_847.76) {
            imposto = 0;
            salarioLiquido = salario;
        } else if (salario > 22_847.76 && salario <= 33_919.80) {
            imposto = 7.5;
            salarioLiquido = salario * ((100 - imposto) / 100);
        } else if(salario > 33_919.80 && salario <= 45_012.60){
            imposto = 15;
            salarioLiquido = salario * ((100 - imposto) / 100);
        } else if(salario > 45_012.60){
            imposto = 27.5;
            salarioLiquido = salario * ((100 - imposto) / 100);
        }

        System.out.printf("%s seu salário líquido é: %.2f imposto de %.2f%%",nome, salarioLiquido, imposto);

    }

}