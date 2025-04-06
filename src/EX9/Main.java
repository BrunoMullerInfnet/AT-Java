package EX9;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        System.out.println(conta.exibirSaldo());

        conta.depositar(500.0);
        System.out.println(conta.exibirSaldo());

        conta.Sacar(200.0);
        System.out.println(conta.exibirSaldo());

        conta.Sacar(2000.0); // Tentativa de saque maior que o saldo
        System.out.println(conta.exibirSaldo());
    }
}