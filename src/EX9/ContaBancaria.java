package EX9;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return 0;
        } else {
            saldo += valor;
            return valor;
        }
    }

    public double Sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return 0;
        } else {
            saldo -= valor;
            return valor;
        }
    }

    public String exibirSaldo() {
        return "Titular: " + titular + ", Saldo: " + saldo;
    }

}